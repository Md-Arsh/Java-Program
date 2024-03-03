//WAP in Java to find square root of a number without sqrt method?

import java.util.Scanner;
class SquareRoot
                {
                    public static void main(String args[])
                    {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter a number: ");
                        int n = sc.nextInt();
                        sc.close();
                        System.out.println("The Square root of " + n + " " + "is" + " " + squareRoot(n));
                    }

                    public static double squareRoot(int num)
                    {
                        double t;
                        double sqrtroot = num / 2;

                        do 
                        {
                            t = sqrtroot;
                            sqrtroot = (t + (num / t)) / 2;
                        }

                        while((t - sqrtroot) != 0);
                        return sqrtroot;
                    }
                }