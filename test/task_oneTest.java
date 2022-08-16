/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;

//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Freya
 */



public class task_oneTest {
    
    public task_oneTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    
    /*
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    */

    /**
     * Test of main method, of class task_one.
     */
    
    /*
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        task_one.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */

    
    
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLength Good");
        String pass = "sheridan";
        boolean expResult = true;
        boolean result = task_one.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckLengthBad() {
        System.out.println("checkLength Bad");
        String pass = "java";
        boolean expResult = false ;
        boolean result = task_one.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLength Boundary");
        String pass = "";
        boolean expResult = false;
        boolean result = task_one.checkLength(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testCheckUpperCaseGood() {
        System.out.println("checkUpperCase Good");
        String pass = "SheRidanCOLLEGE";
        boolean expResult = true;
        boolean result = task_one.checkUpperCase(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckUpperCaseBad() {
        System.out.println("checkUpperCase Bad");
        String pass = "sanfrancisco";
        boolean expResult = false;
        boolean result = task_one.checkUpperCase(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckUpperCaseBoundary() {
        System.out.println("checkUpperCase Boundary");
        String pass = "";
        boolean expResult = false;
        boolean result = task_one.checkUpperCase(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckSpecialCharacterGood() {
        System.out.println("checkSpecialCharacter good");
        String pass = "Helloworld!";
        boolean expResult = true;
        boolean result = task_one.checkSpecialCharacter(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckSpecialCharacterBad() {
        System.out.println("checkSpecialCharacter bad");
        String pass = "Thisisbadinput";
        boolean expResult = false;
        boolean result = task_one.checkSpecialCharacter(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckSpecialCharacterBoundary() {
        System.out.println("checkSpecialCharacter Boundary");
        String pass = "";
        boolean expResult = false;
        boolean result = task_one.checkSpecialCharacter(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
