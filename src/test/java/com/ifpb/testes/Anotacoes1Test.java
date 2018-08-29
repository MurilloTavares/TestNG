package com.ifpb.testes;

import static junit.framework.Assert.assertEquals;
import org.testng.annotations.*;

public class Anotacoes1Test {
    
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }
    
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }
    
    // Utilizando assert
    @Test
    public void teste_1(){
        System.out.println("Teste 1");
        assert 2 == 2;
    }
    
    // Utilizando funcoes JUnit
    @Test
    public void teste_2(){
        System.out.println("Teste 2");
        assertEquals(2, 2);
    }
    
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }
    
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }
    
}
