package practise;

public class Implicit_explicit {

	public static void main(String[] args) {
		 // Implicit type casting 
        int int_num = 10;
        double double_num = int_num;
        System.out.println("Implicit Casting :");
        System.out.println("int_num: " + int_num);
        System.out.println("double_num: " + double_num);
        
        
        // Explicit type casting 
        double DoubleValue = 15.75;
        int IntValue = (int) DoubleValue;
        System.out.println("\nExplicit Casting :");
        System.out.println("DoubleValue: " + DoubleValue);
        System.out.println("IntValue: " + IntValue);
		
		

	}

}
