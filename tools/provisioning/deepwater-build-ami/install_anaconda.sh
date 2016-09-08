echo "setup Anaconda"

sudo apt-get update && apt-get install -y \
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
sudo update-alternatives --set libblas.so.3 /usr/lib/openblas-base/libblas.so.3

# setup anaconda distribution
# copied from https://github.com/ContinuumIO/docker-images/blob/master/anaconda/Dockerfile

sudo apt-get update --fix-missing && sudo apt-get install -y wget bzip2 ca-certificates \
    libglib2.0-0 libxext6 libsm6 libxrender1 \
    git mercurial subversion

echo "export LANG=C.UTF-8" >> /etc/profile.d/conda.sh 
echo "export LC_ALL=C.UTF-8" >> /etc/profile.d/conda.sh 
sudo echo 'export PATH=/opt/conda/bin:$PATH' > /etc/profile.d/conda.sh 

wget --quiet https://repo.continuum.io/archive/Anaconda2-4.1.1-Linux-x86_64.sh -O /tmp/anaconda.sh && \
    sudo /bin/bash /tmp/anaconda.sh -b -p /opt/conda && \
    rm /tmp/anaconda.sh
