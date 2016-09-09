FROM nvidia/cuda:7.5-cudnn5-devel

MAINTAINER H2O.ai <build@h2o.ai>

LABEL Description="H2O Dev Env" 

WORKDIR /workspace

ADD ./install_build_essential.sh /workspace
RUN ./install_build_essential.sh

ADD ./install_java_oracle_8.sh /workspace/
RUN ./install_java_oracle_8.sh

ADD ./install_maven.sh /workspace/
RUN ./install_maven.sh

ADD ./install_bazel.sh /workspace/
RUN ./install_bazel.sh

ADD ./install_anaconda.sh /workspace/
RUN ./install_anaconda.sh

ADD ./install_mxnet_dev_env.sh /workspace
RUN ./install_mxnet_dev_env.sh

ADD ./install_tensorflow_dev_env.sh /workspace
RUN ./install_tensorflow_dev_env.sh

RUN rm -fr /workspace
