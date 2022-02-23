package org.apache.linkis.resourcemanager.external.domain; 
 
import com.google.gson.reflect.TypeToken;
import org.apache.linkis.server.BDPJettyServerHelper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/** 
 * ExternalResourceProvider Tester
*/ 
public class ExternalResourceProviderTest {
    private static final Logger logger = LoggerFactory.getLogger(ExternalResourceProviderTest.class);

    @Autowired
    private ExternalResourceProvider externalResourceProvider;
 
    @BeforeEach
    @DisplayName("Each unit test method is executed once before execution")
    public void before() throws Exception {
    }
 
    @AfterEach
    @DisplayName("Each unit test method is executed once before execution")
    public void after() throws Exception {
    }
 
    @Test
    @DisplayName("Method description: ...")
    public void testGetConfigMap() throws Exception {
        //TODO json字符串转map
        String config ="{\"action\":\"add\",\"id\":\"1\"}";
        Map<String, Object> configMap = new HashMap<>();
        if (configMap == null) {
            configMap =
                    BDPJettyServerHelper.gson()
                            .fromJson(config, new TypeToken<Map<String, Object>>() {}.getType());
        }
        logger.info(configMap.size()+"");
        System.out.println(configMap.size()+"");
    }
}
