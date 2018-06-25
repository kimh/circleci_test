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

	App app;

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

    @Override
	protected void setUp() throws Exception {
    	app = new App();
	}

	/**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
    	assertEquals("Hello World, CircleCI!", app.sayHello("CircleCI"));
    }

    public void testApp2()
    {
    	assertEquals("Hello World, GitHub!", app.sayHello("GitHub"));
    }

    public void testApp3()
    {
    	assertEquals("Hello World, ZenHub2!", app.sayHello("ZenHub2"));
    }
}
