/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class BankApplication {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
       System.out.println("\tWELCOME TO QR CHARTERED BANK");
       System.out.println("\t_____________________________");
       System.out.println("To begin:");
       System.out.println("Enter 1 if opening a new account.");
       System.out.println("Enter 2 if conducting a withdrawal from your account");
       System.out.println("Enter 3 if conducting an account deposit.");
       System.out.println("Enter 4 if you wish to check your account status.");
       
       String Choice = input.nextLine();
       int userChoice = Integer.parseInt(Choice);
        //Account creation operation.
        //Switch statement converted from if-else if. 
        switch (userChoice) {
            case 1:
                System.out.println("Enter your first name and surname respectively.");
                String firstName = input.nextLine();
                String surName = input.nextLine();
                AccountCreation a1 = new AccountCreation( firstName, surName);
                System.out.println("Enter your ID number");
                String idNum = input.nextLine();
                int idNo = Integer.parseInt(idNum);
                AccountCreation ID = new AccountCreation(idNo);
                System.out.println("\n\tQR CHARTERED BANK");
                System.out.println("\tNew Account Details");
                System.out.println("\t_____________________");
                System.out.println(" First Name: " + a1.getFirstName());
                System.out.println("Surname: " + a1.getSurName());
                System.out.println("ID number: " + ID.getID());
                break;
            case 2://For withdrawal operation.
                {
                    System.out.println("Please enter your First name and surname respectively.");
                    String fName = input.nextLine();
                    String sName = input.nextLine();
                    System.out.println("Please enter your account number.");
                    String AccNum = input.nextLine();
                    int AccNo = Integer.parseInt(AccNum);
                    System.out.println("Account balance: 10000");
                    System.out.println("Please enter the amount you wish to withdraw.");
                    String Withdraw = input.nextLine();
                    float AmountWithdrawed = Float.parseFloat(Withdraw);
                    Withdrawal w1 = new Withdrawal(fName, sName, AccNo, AmountWithdrawed);
                    System.out.println("\n\tQR CHARTERED BANK");
                    System.out.println("\t Withdrawal receipt");
                    System.out.println("\t__________________ ");
                    System.out.println("First Name: " + w1.getFirstName());
                    System.out.println("Surname: " + w1.getSurName());
                    System.out.println("Account Number: " + w1.getAccountNumber());
                    System.out.println("Initial Account Balance: " + w1.getInitialAccountBalance());
                    System.out.println("Amount withdrawed: " + w1.getAmountWithdrawed());
                    System.out.println("Final Account Balance " + w1.getFinaAccountBalance());
                    if( w1.getAmountWithdrawed() <= w1.getInitialAccountBalance())
                        System.out.println("Transaction Status: Successful");
                    else
                        System.out.println("Transaction status: DECLINED");
                    
                    break;
                }
            case 3://For account deposit.
                {
                    System.out.println("Please enter your First name and surname respectively.");
                    System.out.println("Please enter your account number.");
                    String fName = input.nextLine();
                    String sName = input.nextLine();
                    String AccNum = input.nextLine();
                    int AccNo = Integer.parseInt(AccNum);
                    System.out.println("Account balance: 10000");
                    System.out.println("Please enter the amount you wish to deposit.");
                    String Deposit = input.nextLine();
                    float AmountDeposited = Float.parseFloat(Deposit);
                    Deposit d1 = new Deposit(fName, sName, AccNo, AmountDeposited);
                    System.out.println("\n\tQR CHARTERED BANK");
                    System.out.println("\t Deposit receipt");
                    System.out.println("\t__________________ ");
                    System.out.println("First Name: " + d1.getFirstName());
                    System.out.println("Surname: " + d1.getSurName());
                    System.out.println("Account Number: " + d1.getAccountNumber());
                    System.out.println("Initial Account Balance: " + d1.getInitialAccountBalance());
                    System.out.println("Amount withdrawed: " + d1.getAmountDeposited());
                    System.out.println("Final Account Balance " + d1.getFinaAccountBalance());
                    System.out.println("Transaction Status: Successful");
                    
                    break;
                }
            case 4://For checking account credit status.
                System.out.println("Please enter your First name and surname respectively.");
                String fName = input.nextLine();
                String sName = input.nextLine();
                System.out.println("Please enter your Account Number.");
                String AccNo = input.nextLine();
                int AccNum = Integer.parseInt(AccNo);
                System.out.println("Please enter your account balance.");
                String AccBal = input.nextLine();
                float AccountBalance = Integer.parseInt(AccBal);
                AccountStatus Stat = new AccountStatus(fName, sName, AccNum);
                if(AccountBalance >= 0 ){
                    System.out.println("\n\tQR CHARTERED BANK");
                    System.out.println("\tAccount Status");
                    System.out.println("\t__________________ ");
                    System.out.println("First Name: " + Stat.getFirstName());
                    System.out.println("Surname: " + Stat.getSurName());
                    System.out.println("Account Number: " + Stat.getAccountNumber());
                    System.out.println("Account credit status: Credit"); 
                }
                else{
                    System.out.println("\n\tAKM CHARTERED BANK");
                    System.out.println("\tAccount Status");
                    System.out.println("\t__________________ ");
                    System.out.println("First Name: " + Stat.getFirstName());
                    System.out.println("Surname: " + Stat.getSurName());
                    System.out.println("Account Number: " + Stat.getAccountNumber());
                    System.out.println("Account credit status: Debt " );
                }
                    break;
            default:
                System.out.println("Please enter an appropriate response.");
                break;
        }
       System.out.println("\tTHANK YOU FOR VISITING QR CHARTERED BANK");
    }   
}
