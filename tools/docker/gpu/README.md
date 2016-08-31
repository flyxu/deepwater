

1. Create wheel from source
```bash
 ./bazel-bin/tensorflow/tools/pip_package/build_pip_package /home/fmilo/workspace/deeperwater/tools/docker/gpu/
```

```bash
nvidia-docker run -i -t -p 8887:8888 h2o/deepwater /bin/bash -c "/opt/conda/bin/conda install jupyter -y --quiet && mkdir /opt/notebooks && /opt/conda/bin/jupyter notebook --notebook-dir=/opt/notebooks --ip='*' --port=8888 --no-browser"
```
