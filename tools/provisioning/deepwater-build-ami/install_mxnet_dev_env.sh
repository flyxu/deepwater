#!/bin/bash
set -e 

export DEBIAN_FRONTEND=noninteractive

echo "setup mxnet dependencies"
sudo apt-get install -y build-essential git libatlas-base-dev libopencv-dev
