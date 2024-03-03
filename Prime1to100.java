

public class Prime1to100 
                        {
                            public static void main(String[] args)
                            {
                                int i, count;
                                for(i = 1; i <= 5; i++)
                                {
                                    count = 0;
                                    for(int j = 1; j <= i; j++)
                                    {
                                        if(i % j == 0)
                                        {
                                            count++;
                                        }
                                    }
                                    if(count == 2)
                                    {
                                        System.out.println(i);
                                    }
                                }
                            }
                        }
