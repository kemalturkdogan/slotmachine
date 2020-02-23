/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachine;

import javax.swing.ImageIcon;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cemal
 */
public class SlotTest {
    
    public SlotTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of genRand method, of class Slot.
     */
    @Test
    public void testGenRand() {
        System.out.println("genRand");
        Slot instance = new Slot();
        instance.genRand();
       
    }

    /**
     * Test of setReels method, of class Slot.
     */
    @Test
    public void testSetReels() {
        System.out.println("setReels");
        int ico1 = 3;
        int ico2 = 3;
        int ico3 = 3;
        Slot instance = new Slot();
        instance.setReels(ico1, ico2, ico3);
        
    }

    /**
     * Test of buyCredits method, of class Slot.
     */
    @Test
    public void testBuyCredits() {
        System.out.println("buyCredits");
        Slot instance = new Slot();
        instance.buyCredits();
        
    }

    /**
     * Test of getPrize method, of class Slot.
     */
    @Test
    public void testGetPrize() {
        System.out.println("getPrize");
        double prize = 5.0;
        Slot instance = new Slot();
        double expResult = 25.0;
        double result = instance.getPrize(prize);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of loadImages method, of class Slot.
     */
    @Test
    public void testLoadImages() {
        System.out.println("loadImages");
        Slot instance = new Slot();
        instance.loadImages();
        
    }

   

    /**
     * Test of matchControl method, of class Slot.
     */
    @Test
    public void testMatchCheck() {
        System.out.println("matchCheck");
        Slot instance = new Slot();
        instance.matchControl();
        
    }

    /**
     * Test of lose method, of class Slot.
     */
    @Test
    public void testLose() {
        System.out.println("lose");
        Slot instance = new Slot();
        int expResult = 1;
        int result = instance.lose();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of win method, of class Slot.
     */
    @Test
    public void testWin() {
        System.out.println("win");
        Slot instance = new Slot();
        int expResult = 1;
        int result = instance.win();
        assertEquals(expResult, result);
        
    }

  
    
}
