//WAP to print fibonacci series 1 to n terms in java.

import java.util.Scanner;

public class FibonacciOneToNTerms 
                                {
                                    public static void main(String args[])
                                    {
                                        int n, x = 0, y = 1, z = 0, term = 0;
                                        Scanner sc = new Scanner(System.in);
                                        System.out.println("Enter number: ");
                                        n = sc.nextInt();
                                        sc.close();

                                        System.out.println("Fibonacci series upto " + n + "terms");

                                        while(term <= n)
                                        {
                                            System.out.println(x);
                                            x = y;
                                            y = z;
                                            z = x + y;
                                            term  = term + 1;
                                        }
                                    }                                    
                                }
