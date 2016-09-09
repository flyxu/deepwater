#!/bin/bash

set -e

DEBIAN_FRONTEND=nointeractive

sudo apt-get install -y curl tar bash

MAVEN_VERSION=3.3.9
USER_HOME_DIR="/root"

sudo mkdir -p /usr/share/maven /usr/share/maven/ref 
curl -fsSL http://apache.osuosl.org/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz | tar -xzC /usr/share/maven --strip-components=1 
sudo ln -s /usr/share/maven/bin/mvn /usr/bin/mvn

sudo echo "MAVEN_HOME=/usr/share/maven" >> /etc/profile.d/maven.sh
sudo echo "MAVEN_CONFIG=\"$USER_HOME_DIR/.m2\"" >> /etc/profile.d/maven.sh

mvn --version 
