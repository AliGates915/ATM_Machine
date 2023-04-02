package Bank_ATM;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;
public class Bank_ATM {
    // This is main
    public static void main(String[] args)
    {
        ATM_Operation_Interface operation = new ATM_Operation_ImplementsImpl();
        int atm_number = 123;
        int pin_code = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ***||**** Welcome To ATM Machine ****||***");
        System.out.print("Enter ATM Number : ");
        int ATMNumber = sc.nextInt();
        System.out.print("Enter PIN CODE : ");
        int pincode = sc.nextInt();
        if(atm_number == ATMNumber && pin_code == pincode)
        {
            System.out.println("Successfully Validation Done!");
            while (true)
            {
                System.out.println();
                System.out.print("""
                        1. View Available Balance
                        2. WithDraw Amount
                        3. Deposit Amount 
                        4. View Some Details
                        5. Exit from The Application
                        """);
                System.out.println("Enter the Choice : ");
                int ch= sc.nextInt();
                if(ch==1)
                {
                    operation.view_Balance();
                }
                else if(ch==2)
                {
                    System.out.println("Enter Your Amount for WithDraw : ");
                    double withdraw = sc.nextDouble();
                    operation.WithDraw_Amount(withdraw);
                }
                else if (ch==3)
                {
                    System.out.println("Enter Amount to Deposit : ");
                    double depositAmount = sc.nextDouble();
                    operation.depositAmount(depositAmount);
                }
                else if (ch==4)
                {
                    operation.view_Balance();
                    operation.View_Some_Details();
                }
                else if(ch==5)
                {
                    System.out.println("Collect Your Own ATM CARD... \n Thanks for using ATM MACHINE ");
                    System.exit(0);
                }
                System.out.println("Please Enter Correct Choice");
            }

        }
        else if (atm_number == ATMNumber && pin_code != pincode)
        {
            System.out.println("Incorrect PIN CODE ");
            System.exit(0);
        }
        else if (atm_number != ATMNumber && pin_code == pincode)
        {
            System.out.println("Incorrect ATM Number ");
            System.exit(0);
        }
        else
        {
            System.out.println("Incorrect ATM Number or PIN CODE");
            System.exit(0);
        }

    }
}
