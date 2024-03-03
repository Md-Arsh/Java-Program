import java.util.Scanner;
class StrongNumber
                    {
                        public static void main(String args[])
                        {
                            int num, originalNum, i, sum = 0, rem, fact = 1;

                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter number to check: ");
                            num = sc.nextInt();
                            sc.close();

                            originalNum = num;

                            while(num > 0)
                            {
                                rem = num % 10;
                                fact = 1;

                                for(i = 1; i <= rem; i++)
                                {
                                    fact = fact * i;
                                }
                                sum = sum + fact;
                                num = num / 10;
                            }
                            if(sum == originalNum)
                            {
                                System.out.println(originalNum + "is a Strong number");
                            }
                            else
                            {
                                System.out.println(originalNum + "is not a Strong number");
                            }
                        }
                    }