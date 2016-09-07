#!/bin/sh

docker run \
  --volume $PWD:/workspace \
  --workdir /workspace \
  d11wtq/packer:0.8.5 \
  packer build \
    -var source_ami=ami-2d39803a \
    -var aws_region=us-east-1 \
    -var version=1.7.1 \
    -var revision=1 \
    -var aws_access_key=$AWS_ACCESS_KEY_ID \
    -var aws_secret_key=$AWS_SECRET_ACCESS_KEY \
   $1 
