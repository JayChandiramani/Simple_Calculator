package com.jetbrain;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double Num1,Num2,Result = 0;
	char Operator;
	Scanner Reader=new Scanner(System.in);

	//Entering Numbers and the Operator
        System.out.println("Please enter 2 numbers.");
        System.out.print("Number 1: ");
        Num1=Reader.nextDouble();
        System.out.print("Number 2: ");
        Num2=Reader.nextDouble();
        System.out.println();
        System.out.println("Please enter the operator that you wish to use.");
        System.out.print("Operator: ");
        Operator=Reader.next().charAt(0);
        System.out.println();

    //Switch Case
        switch (Operator) {
            case '+' -> Result = Num1 + Num2;
            case '-' -> Result = Num1 - Num2;
            case '*' -> Result = Num1 * Num2;
            case '/' -> Result = Num1 / Num2;
            default -> System.out.println("Invalid Operator Entered");
        }
        System.out.println("The result is "+Result);
    }
}
