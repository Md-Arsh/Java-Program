import java.util.Scanner;
class FibonacciSeries
                    {
                        public static void main(String args[])
                        {
                            int n, x = 0, y = 1, z = 0, i;
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter number: ");
                            n = sc.nextInt();
                            sc.close();

                            for(i = 1; i <= n; i++)
                            {
                                System.out.println(z);
                                x = y;
                                y = z;
                                z = x + y;
                            }
                        }
                    }