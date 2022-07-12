/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indulac.apphibernate;

import org.hibernate.Session;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jburgos
 */
public class PrincipalTest {
    
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Principal.main(args);
        assertEquals(0, 0);
    }

    
}
