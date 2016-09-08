FROM nvidia/cuda:7.5-cudnn5-devel

ADD . /tmp/

WORKDIR /tmp

RUN chmod u+x *.sh
RUN ./install_java.sh
RUN ./install_bazel.sh
RUN ./install_anaconda.sh
RUN ./install_mxnet_dev_env.sh
RUN ./install_tensorflow_dev_env.sh

RUN rm -fr /tmp
