// Simple Calculator using java  : 
import java.util.Scanner;
public class Simple_calculator {
    public static void main(String[]args){
        //Create an object of Scanner
        Scanner input = new Scanner(System.in);
        
        // Declaring Variable
        char operator;
        double Number1,Number2,Result;

        // Asking the user to input the operator
        System.out.println("Enter the operator(+,-,*,/) : ");
        operator = input.next().charAt(0);

        // Asking the user to input the numbers
        System.out.println("Enter the First number : ");
        Number1 = input.nextDouble();

        System.out.println("Enter the second number : ");
        Number2 = input.nextDouble();

        switch(operator){
            // Performing Addition
            case '+' :{
                Result = Number1 + Number2;
                System.out.println("Addition of "+Number1+" and "+Number2+ " is : "+Result);
                break;
            }
            //performing subtraction
            case '-':{
                Result = Number1 - Number2;
                System.out.println("Subtraction of "+Number1+" and "+Number2+ " is : "+Result);
                break;
            }
            // Performing Multiplication
            case '*':{
                Result = Number1 * Number2;
                System.out.println("Multiplication of "+Number1+" and "+Number2+ " is : "+Result);
                break;
            }
            //performing Division
            case '/':{
                Result = Number1 / Number2;
                System.out.println("Divition of "+Number1+" and "+Number2+ " is : "+Result);
                break;
            }
           
            // Default Command
            default:{
                System.out.println("Unsupported/Invalid input");
            }


    input.close();
    }
}
}
