package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationImplementation op=new AtmOperationImplementation();
        int userAtmNumber=12345;
        int userAtmPin=123;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.println("Enter ATM number");
        int atmNumber=sc.nextInt();
        System.out.println("Enter ATM number");
        int atmPin=sc.nextInt();
        if (atmNumber == userAtmNumber && atmPin == userAtmPin){
            while (true){
                System.out.println("1. View Available Balance\n" +
                        "\n 2. Withdraw Amount \n" +
                        "\n 3. Deposit Amount \n" +
                        "\n 4. View Mini statement \n" +
                        "\n 5. Exit \n" +
                        "\n Enter the choice -");
                int ch=sc.nextInt();
                if (ch==1){
                    op.viewBalance();
                } else if (ch==2) {
                    System.out.println("Enter amount to withdraw :");
                    double withdrawAmount=sc.nextInt();
                    op.withdrawAmount(withdrawAmount);
                }else if (ch==3) {
                    System.out.println("Enter amount Deposit : ");
                    double depositAmount=sc.nextInt();
                    op.depositAmount(depositAmount);
                }else if (ch==4) {
                    op.viewMiniStatement();
                }else if (ch==5) {
                    System.out.println("Collect your ATM card \n Thank you for using ATM machine");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter correct choice");
                }
            }

        }
        else {
            System.out.println("Incorrect ATM number or pin");
            System.exit(0);
        }
    }
}