import java.util.Scanner;
class ATMProgram
                {
                    public static void main(String args[])
                    {
                        int balance = 100000, withdraw, deposit;

                        Scanner sc = new Scanner(System.in);

                        while(true)
                        {
                            System.out.println("Welcome to the ATM-");
                            System.out.println("Choose 1. for Withdraw");
                            System.out.println("Choose 2. for Deposit");
                            System.out.println("Choose 3. for Check Balance");
                            System.out.println("Choose 4. for Exit");

                            int ch = sc.nextInt();

                            switch(ch)
                            {
                                case 1:
                                System.out.println("Enter money to be Withdrawn: ");
                                withdraw = sc.nextInt();

                                if(balance >= withdraw)
                                {
                                    balance = balance - withdraw;
                                    System.out.println("Please Collect your money" + withdraw);
                                }
                                else
                                {
                                    System.out.println("Insufficient Balance:!");
                                }
                                break;

                                case 2:
                                System.out.println("Enter money to be Deposited: ");
                                deposit = sc.nextInt();

                                balance = balance + deposit;
                                System.out.println("Your money has been Successfully deposited: ");
                                
                                break;

                                case 3:
                                System.out.println("Your Current balance is " + balance);
                                break;

                                case 4:
                                System.exit(0);

                                sc.close();
                            }
                        }
                    }
                }