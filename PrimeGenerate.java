//WAP to generate required number of primes using methods?

import java.io.*;
class PrimesGen
                {
                    static boolean prime(long num)
                    {
                        boolean isPrime = true;

                        for(int i = 2; i <= num - 1; i++)
                        {
                            if(num % i == 0)
                            {
                                isPrime = false;
                            }
                        }
                            return isPrime;
                        
                    }
                    static void generate(long max)
                    {
                        long c = 1, num = 2;

                        while(c <= max)
                        {
                            if(prime(num))
                            {
                                System.out.println(num);
                                ++c;
                            }
                            ++num;
                        }
                    } 
                }
class PrimeGenerate
                    {
                        public static void main(String args[]) throws IOException
                        {
                            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                            System.out.print("How many Primes?");
                            int max = Integer.parseInt(br.readLine());
                            PrimesGen.generate(max);
                        }
                    }