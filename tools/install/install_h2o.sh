FROM ubuntu:16.04

MAINTAINER Fabrizio Milo <fabrizio@h2o.ai>

LABEL Description="H2O" \
      "0xData H2O Version"="$H2O_VERSION"

RUN apt-get update
RUN apt-get install  --no-install-recommends software-properties-common -y && apt-add-repository ppa:webupd8team/java
RUN apt-get update

RUN echo oracle-java8-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections

RUN apt-get -y install oracle-java8-installer --no-install-recommends 
RUN apt-get -y install oracle-java8-set-default --no-install-recommends

# Install additional tools
RUN apt-get -y install --no-install-recommends \
  less \
  curl \
  vim-tiny \
  sudo \
  openssh-server \
  unzip \
  git

RUN apt-get -y install --no-install-recommends \
  nodejs \
  npm

RUN apt-get -y install r-base r-cran-rcurl  

RUN apt-get autoremove -y && \
    apt-get clean

RUN mkdir /h2o-build

WORKDIR /h2o-build

RUN git clone https://github.com/h2oai/h2o-3.git 
WORKDIR /h2o-build/h2o-3

RUN ./gradlew syncSmalldata
RUN apt-get install -y r-cran-rjson r-cran-survival r-cran-rgl 
RUN ./gradlew syncRPackages
RUN ./gradlew build 
