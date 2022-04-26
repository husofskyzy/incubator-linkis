package org.apache.linkis.udf.dao;

import org.h2.tools.Server;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UDFDaoTest extends BaseDaoTest{
    @Autowired
    private UDFDao udfDao;

    @BeforeAll
    @DisplayName("Each unit test method is executed once before execution")
    protected static void beforeAll() throws Exception {
        // Start the console of h2 to facilitate viewing of h2 data
        Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082").start();
    }

    @AfterAll
    @DisplayName("Each unit test method is executed once before execution")
    protected static void afterAll() throws Exception {}



    @Test
    public void testGetUDFById(){
        System.out.println(udfDao.getUDFById(1L));
    }
}
