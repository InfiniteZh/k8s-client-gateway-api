## dockerfile
```dockerfile
FROM docker:stable

COPY gen-main gen

# install git, bash, kind, kubectl and clone the kubernetes-client/gen code base
RUN apk add --no-cache git bash && \
    wget -O /usr/bin/kind https://kind.sigs.k8s.io/dl/v0.20.0/kind-linux-amd64 && \
    chmod +x /usr/bin/kind && \
    wget -O /usr/bin/kubectl https://dl.k8s.io/release/v1.28.1/bin/linux/amd64/kubectl && \
    chmod +x /usr/bin/kubectl && \
    chmod +x gen && \
    cd gen
#    git checkout 729332ad08f0f4d98983b7beb027e2f657236ef9
    # 729332ad08f0f4d98983b7beb027e2f657236ef9 is the last commit using python2 interpreter


COPY Dockerfile.gen gen/openapi/openapi-generator/Dockerfile
COPY generate.sh generate.sh

RUN chmod +x generate.sh

WORKDIR gen/openapi

CMD ["/generate.sh"]
```

```dockerfile
ARG BASE_IMAGE=ghcr.io/yue9944882/crd-model-gen-base:v1.1
FROM ${BASE_IMAGE}
# TODO: move this to kubernetes-client group after the permission issue fixed

ARG GENERATION_XML_FILE

# Copy required files
COPY openapi-generator/generate_client_in_container.sh /generate_client.sh
COPY preprocess_spec.py /
COPY custom_objects_spec.json /
COPY ${GENERATION_XML_FILE} /pom.xml

ENTRYPOINT ["mvn-entrypoint.sh", "/generate_client.sh"]
```
修改为pom，否则会变成`generation_xml_file.xml/pom.xml`

