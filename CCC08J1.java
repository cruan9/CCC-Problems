import java.io.*;
import java.util.*;

public class CCC08J1 {
    	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double w = input.nextDouble();
		double h = input.nextDouble();
		if(w/(h*h) > 25) {
			System.out.println("Overweight");
		}
		else if(w/(h*h) < 18.5) {
			System.out.println("Underweight");
		}
		else {
			System.out.println("Normal weight");
		}
	}
}