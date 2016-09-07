FROM nvidia/cuda:7.5-cudnn4-devel
MAINTAINER H2O.AI <deepwater@h2o.ai>

ENV CUDNN_VERSION 4
LABEL com.nvidia.cudnn.version="4"

RUN echo "$CUDNN_VERSION"


ARG THEANO_VERSION=rel-0.8.2
ARG TENSORFLOW_VERSION=0.10.0
ARG TENSORFLOW_ARCH=gpu
ARG KERAS_VERSION=1.0.3
ARG LASAGNE_VERSION=v0.1
ARG TORCH_VERSION=latest
ARG CAFFE_VERSION=master

# Install some dependencies
RUN apt-get update && apt-get install -y \
		bc \
		build-essential \
		cmake \
		curl \
		g++ \
		gfortran \
		git \
		libffi-dev \
		libfreetype6-dev \
		libhdf5-dev \
		libjpeg-dev \
		liblcms2-dev \
		libopenblas-dev \
		liblapack-dev \
		libpng12-dev \
		libssl-dev \
		libtiff5-dev \
		libwebp-dev \
		libzmq3-dev \
		nano \
		pkg-config \
		python-dev \
		software-properties-common \
		unzip \
		vim \
		wget \
		zlib1g-dev \
		&& \
	apt-get clean && \
	apt-get autoremove && \
	rm -rf /var/lib/apt/lists/* && \
# Link BLAS library to use OpenBLAS using the alternatives mechanism (https://www.scipy.org/scipylib/building/linux.html#debian-ubuntu)
update-alternatives --set libblas.so.3 /usr/lib/openblas-base/libblas.so.3


# setup anaconda distribution
# copied from https://github.com/ContinuumIO/docker-images/blob/master/anaconda/Dockerfile
ENV LANG=C.UTF-8 LC_ALL=C.UTF-8

RUN apt-get update --fix-missing && apt-get install -y wget bzip2 ca-certificates \
    libglib2.0-0 libxext6 libsm6 libxrender1 \
    git mercurial subversion

RUN echo 'export PATH=/opt/conda/bin:$PATH' > /etc/profile.d/conda.sh && \
    wget --quiet https://repo.continuum.io/archive/Anaconda2-4.1.1-Linux-x86_64.sh -O ~/anaconda.sh && \
    /bin/bash ~/anaconda.sh -b -p /opt/conda && \
    rm ~/anaconda.sh

RUN apt-get install -y curl grep sed dpkg && \
    TINI_VERSION=`curl https://github.com/krallin/tini/releases/latest | grep -o "/v.*\"" | sed 's:^..\(.*\).$:\1:'` && \
    curl -L "https://github.com/krallin/tini/releases/download/v${TINI_VERSION}/tini_${TINI_VERSION}.deb" > tini.deb && \
    dpkg -i tini.deb && \
    rm tini.deb && \
    apt-get clean

ENV PATH /opt/conda/bin:$PATH

RUN # Install other useful Python packages using pip
RUN conda install -y --quiet \
		ipython \
		jupyter \
		Cython \
		ipykernel \
		jupyter \
		path.py \
		Pillow \
		pygments \
		six \
		sphinx \
		wheel \
		pyzmq \
		&& \
	python -m ipykernel.kernelspec

# Install Oracle Java 7
RUN \
  DEBIAN_FRONTEND=noninteractive \
  add-apt-repository -y ppa:webupd8team/java && \
  apt-get update -q && \
  echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  echo debconf shared/accepted-oracle-license-v1-1 seen true | debconf-set-selections && \
  DEBIAN_FRONTEND=noninteractive apt-get install -y oracle-java7-installer && \
  apt-get clean 

#Install TensorFlow
#TODO use ${TENSORFLOW_VERSION}
#ENV TF_BINARY_URL=https://storage.googleapis.com/tensorflow/linux/gpu/tensorflow-0.10.0-cp27-none-linux_x86_64.whl
ADD tensorflow-0.10.0-py2-none-any.whl .
RUN pip install --ignore-installed --upgrade  tensorflow-0.10.0-py2-none-any.whl

# Fetch h2o latest_stable
RUN \
  wget http://h2o-release.s3.amazonaws.com/h2o/latest_stable -O latest && \
  wget --no-check-certificate -i latest -O /opt/h2o.zip && \
  unzip -d /opt /opt/h2o.zip && \
  rm /opt/h2o.zip && \
  cd /opt && \
  cd `find . -name 'h2o.jar' | sed 's/.\///;s/\/h2o.jar//g'` && \ 
  cp h2o.jar /opt && \
  pip install `find . -name "*.whl"` && \
  wget https://raw.githubusercontent.com/h2oai/h2o-3/master/docker/start-h2o-docker.sh

# TODO make this a mountable volume
RUN mkdir /opt/notebooks 

ENTRYPOINT [ "/usr/bin/tini", "--" ]
# CMD [ "/bin/bash" ]
CMD ["opt/conda/bin/jupyter", "notebook", "--notebook-dir=/opt/notebooks", "--ip='*'", "--port=8888", "--no-browser"]


