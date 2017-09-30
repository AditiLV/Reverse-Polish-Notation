/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intjava;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 3a
 */
public class IntJavaTest  extends TestCase
{
    
    
    
  private IntJava parser = null;

    @Before
    protected void setUp() throws Exception
    {
        super.setUp();
        parser = new IntJava();
    }

    @After
    protected void tearDown() throws Exception
    {
        parser = null;
        super.tearDown();
    }

    @Test
    public void testBaseCase()
    {
        assertEquals(0, parser.parse("0"));
    }
    
    @Test
    public void testBitwiseComplement()
    {
        assertEquals(~16, parser.parse("16 ~"));
    }

    @Test
    public void testMultiplication()
    {
        assertEquals(2 * 4, parser.parse("2 4 *"));
    }

    @Test
    public void testDivision()
    {
        assertEquals(10 / 3, parser.parse("10 3 /"));
    }

    @Test
    public void testModulus()
    {
        assertEquals(4 % 3, parser.parse("4 3 %"));
    }

    @Test
    public void testAddition()
    {
        assertEquals(7 + 3, parser.parse("7 3 +"));
    }

    @Test
    public void testSubtraction()
    {
        assertEquals(45 - 3, parser.parse("45 3 -"));
    }

    @Test
    public void testBitwiseAnd()
    {
        assertEquals(17 & 5, parser.parse("17 5 &"));
    }

    @Test
    public void testBitwiseExclusiveOr()
    {
        assertEquals(511 ^ 56, parser.parse("511 56 ^"));
    }

    @Test
    public void testBitwiseInclusiveOr()
    {
        assertEquals(42 | 21, parser.parse("42 21 |"));
    }
    
    @Test
    public void testComplexExpression()
    {
    	assertEquals(12, parser.parse("5 6 * 3 2 * 3 * -"));
    }
    
}
