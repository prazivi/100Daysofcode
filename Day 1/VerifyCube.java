//Take two positive integers from the user. Verify if (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.
//
//Calculate the Left hand side (LHS) and the right hand side (RHS) of the equation. 
//Print the (LHS) and the (RHS).
//
//Print VERIFIED in uppercase if they are equal, otherwise print NOT VERIFIED.

//Input:
//4 5


//Output:
//
//729
//729
//VERIFIED






package Conditionals;
import java.util.*;

public class VerifyCube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
		long LHS = (a+b)*(a+b)*(a+b);
		long RHS = ((a*(a*a)) + (b*(b*b)) + 3*(a*(b*a)) + 3*(a*(b*b)));
		System.out.println(LHS);
		System.out.println(RHS);
		if(LHS==RHS)
			System.out.println("VERIFIED");
		else
			System.out.println("NOT VERIFIED");
		
		// TODO Auto-generated method stub

	}

}
