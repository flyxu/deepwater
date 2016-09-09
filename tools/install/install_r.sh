#!/bin/bash

set -e

apt-get install -y r-base r-cran-rcurl r-cran-rjson r-cran-survival r-cran-rgl

apt-get autoremove -y

apt-get clean
