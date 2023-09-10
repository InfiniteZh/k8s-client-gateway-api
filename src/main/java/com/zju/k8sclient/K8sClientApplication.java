package com.zju.k8sclient;

import io.kubernetes.client.openapi.models.V1Pod;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class K8sClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sClientApplication.class, args);
    }

}
