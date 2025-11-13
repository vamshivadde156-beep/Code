import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class Calculator {

        public static  void main (String[] args)
        {


            int num1, num2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();

            System.out.println("Enter the operator (+,-,*,/):");

            char op = sc.next().charAt(0);
            int res = 0;

            switch (op) {
                case '+':
                    res= num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;

                default:
                    System.out.println("You enter wrong input");
            }

            System.out.println(res);

        }



}
