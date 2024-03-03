import java.util.Scanner;
public class PrimeNumber 
                        {
                            public static void main(String args[])
                            {
                                int i, n, count = 0;
                                Scanner sc = new Scanner(System.in);
                                System.out.println("Enter number to check prime or not: ");
                                n = sc.nextInt();
                                sc.close();
                                
                                    for(i = 1; i <= n; i++)
                                    {
                                        if(n % i == 0)
                                        {
                                            count++;
                                        }
                                    }
                                    if(count == 2)
                                    {
                                        System.out.println("Number is Prime: ");
                                    }
                                    else
                                    {
                                        System.out.println("Number is not Prime: ");
                                    }
                            }
                        }
