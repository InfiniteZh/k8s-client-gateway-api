package com.zju.k8sclient;

import com.zju.models.V1beta1HTTPRoute;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class K8sClientApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shouldK8sClient() {
        V1beta1HTTPRoute route = new V1beta1HTTPRoute();

    }

}
