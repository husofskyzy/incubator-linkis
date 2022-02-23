package org.apache.linkis.resourcemanager.external.yarn; 
 
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/** 
 * YarnResourceIdentifier Tester
*/ 
public class YarnResourceIdentifierTest { 
 
    @Autowired
    private YarnResourceIdentifier yarnResourceIdentifier;
 
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
    public void testGetQueueName() throws Exception { 
        //TODO: Test goes here... 
    } 
 
 
    @Test
    @DisplayName("Method description: ...")
    public void testGetResourceType() throws Exception { 
        //TODO: Test goes here... 
    } 
 
 
} 
