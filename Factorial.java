class Factorial 
                {
                    static long factorial(int num)
                    {
                        long fact = 1;
                        while(num > 0)
                        {
                            fact *= num--;
                            
                        }
                        return fact;
                    }
                    public static void main(String args[])
                    {
                        System.out.println("Factorial of 5: ");
                        System.out.println(Factorial.factorial(5));
                    }
                }
