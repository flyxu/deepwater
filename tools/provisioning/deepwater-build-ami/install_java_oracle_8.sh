#!/bin/bash
# ubuntu
set -e

export DEBIAN_FRONTEND=noninteractive

# Install Java.
sudo \
  echo debconf shared/accepted-oracle-license-v1-1 select true | debconf-set-selections && \
  echo debconf shared/accepted-oracle-license-v1-1 seen true | debconf-set-selections && \
  apt-get install -y software-properties-common && \
  add-apt-repository -y ppa:webupd8team/java && \
  apt-get update && \
  apt-get install -y oracle-java8-installer oracle-java8-set-default --no-install-recommends && \
  rm -rf /var/lib/apt/lists/* && \
  rm -rf /var/cache/oracle-jdk8-installer

apt-get autoremove -y 
apt-get clean
echo "export JAVA_HOME=/usr/lib/jvm/java-8-oracle" >> /etc/profile.d/java_env.sh
