import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        int number ;

        int evensum=0;

        int oddsum=0;

        int choice;

        do {
            System.out.println("Enter your number : ");
            number= sc.nextInt();

            if (number%2==0){
                evensum+=number;
            }
            else {
                oddsum+=number;
            }
            System.out.println("if you want to continue? Press 1 for yes and 0 for no");
            choice = sc.nextInt();

        }while (choice==1);
        System.out.println("sum of even number is" +" "+ evensum);
        System.out.println("sum of odd number is" + " "+ oddsum);




    }}
