

public class HelloWorldTest{
	private static String greeting;
	
	public static void main(String[] args){
		greeting = "Hello World!";
		Thread thread = new Thread( () ->  {System.out.println(HelloWorldTest.greeting);});
		thread.start();
	}

}
