import java.util.Scanner;

public class Prime1toN 
                        {
                            public static void main(String arshad[])
                            {    
                                int n, i, j, count, total = 0;
                                Scanner sc = new Scanner(System.in);
                                System.out.println("Enter number of Range: ");
                                n = sc.nextInt();
                                sc.close();

                                for(i = 1; i <= n; i++)
                                {
                                    count = 0;
                                    for(j = 1; j <= i; j++)
                                    {
                                        if(i % j == 0)
                                        {
                                            count++;
                                        }
                                    }
                                    if(count == 2)
                                    {
                                        System.out.print("Prime number" + i);
                                        total = total++;
                                    }
                                }
                                System.out.println("Total Prime numbers between 1 to" + n + " " + total);
                            }
    
                        }
