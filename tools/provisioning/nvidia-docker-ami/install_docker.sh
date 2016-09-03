#!/bin/bash

# Docker Engine installation procedure (Sep 2016)
# https://docs.docker.com/engine/installation/linux/ubuntulinux/

if [[ "$(whoami)" != "root" ]]
then
  echo "Switching to root..."
  exec sudo -E -- "$0" "$@"
fi

echo "Sleeping for 30 seconds..."
sleep 30

echo "Adding apt-key for get.docker.io..."
apt-get install apt-transport-https ca-certificates
apt-key adv --keyserver hkp://p80.pool.sks-keyservers.net:80 \
 --recv-keys 58118E89F3A912897C070ADBF76221572C52609D

echo "Setting up sources for get.docker.io..."
echo 'deb https://apt.dockerproject.org/repo ubuntu-trusty main' \
  > /etc/apt/sources.list.d/docker.list

export DEBIAN_FRONTEND=noninteractive

echo "Updating system..."
apt-get -y update
apt-get -y upgrade

echo "Installing kernel extensions..."
apt-get -y install linux-image-extra-$(uname -r) linux-image-extra-virtual

apt-get -y purge lxc-docker

apt-get -y install docker-engine

groupadd docker

echo "Adding ubuntu user to docker group..."
usermod -aG docker $USER 

echo "Start docker service"
sudo service docker start

echo "Done."
