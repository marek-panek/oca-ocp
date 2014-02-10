package oracle.certified.associate.topic1;

public class JavaInitializers {
	private static int counter1;
	private static Integer counter2;
	private static int counter3 = 3;
	private static Integer counter4;
	
	{
		counter4 = 4; 
	}
	
	private int number1;
	private int number2;
	
	public static void main(String[] args) {
		JavaInitializers initializers = new JavaInitializers();
		initializers.number1 = 5;
		
		System.out.println(JavaInitializers.counter1);
		System.out.println(JavaInitializers.counter2);
		System.out.println(JavaInitializers.counter3);
		System.out.println(JavaInitializers.counter4);
		System.out.println(initializers.number1);
		System.out.println(initializers.number2);
		
		int localValue1, localValue2;
		
		if (initializers.number1 < 5) {
			localValue1 = 10;
		} else {
			localValue1 = 20;
		}
		
		System.out.println(localValue1);
		
		if (initializers.number1 < 5) {
			localValue2 = 10;
		}
		
		if (initializers.number1 >= 5) {
			localValue2 = 20;
		}
		
		// The local variable localValue2 may not have been initialized
		// Here the compiler complains aboout that
		// System.out.println(localValue2);
	}
	
	
}
