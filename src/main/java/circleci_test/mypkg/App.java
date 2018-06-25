package circleci_test.mypkg;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	App main = new App();
    	System.out.println(main.sayHello("CircleCI"));
    }

    public String sayHello(String str){
    	return "Hello World, "+str+"!";
    }
}
