package circleci_test.mypkg;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
    	App app = new App();
    	assertEquals("Hello World, CircleCI!", app.sayHello("CircleCI"));
    }

    public void testApp2()
    {
    	App app = new App();
    	assertEquals("Hello World, GitHub!", app.sayHello("GitHub"));
    }
}
