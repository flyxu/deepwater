#!/bin/bash
set -e 

export DEBIAN_FRONTEND=noninteractive

sudo apt-get update && apt-get install -y --no-install-recommends \
        build-essential \
        curl \
        git \
        libfreetype6-dev \
        libpng12-dev \
        libzmq3-dev \
        pkg-config \
        rsync \
        software-properties-common \
        swig \
        unzip \
        zip \
        zlib1g-dev \
        && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Running bazel inside a `docker build` command causes trouble, cf:
#   https://github.com/bazelbuild/bazel/issues/134
# The easiest solution is to set up a bazelrc file forcing --batch.
echo "startup --batch" >>$HOME/.bazelrc

# Similarly, we need to workaround sandboxing issues:

echo "export BAZELRC=$HOME/.bazelrc" >> /etc/profile.d/bazel.sh

# Install the most recent bazel release.
export BAZEL_VERSION="0.3.0"

BAZEL_URL="https://github.com/bazelbuild/bazel/releases/download/$BAZEL_VERSION/bazel-$BAZEL_VERSION-installer-linux-x86_64.sh"
echo $BAZEL_URL

mkdir /bazel 
cd /bazel
curl -fSsL -O $BAZEL_URL
curl -fSsL -o /bazel/LICENSE.txt https://raw.githubusercontent.com/bazelbuild/bazel/master/LICENSE.txt 
chmod +x /bazel/bazel-*.sh 
/bazel/bazel-$BAZEL_VERSION-installer-linux-x86_64.sh 
rm -f /bazel/bazel-$BAZEL_VERSION-installer-linux-x86_64.sh
