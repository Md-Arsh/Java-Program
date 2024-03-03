import java.util.Scanner;
class SumofNaturalNum
                    {
                        public static void main(String args[])
                        {
                            int i, num, sum = 0;
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter range of the number: ");
                            num = sc.nextInt();
                            sc.close();
                            for(i = 1; i <= num; i++ )
                            {
                                sum = sum + i;
                            }
                            System.out.println("Sum: " + sum);
                        }
                    }
