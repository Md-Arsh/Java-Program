class BitwiseExample
                    {
                        public static void main(String args[])
                        {
                            byte x, y;
                            x = 10;
                            y = 11;

                            System.out.println("~x = " + (~x));
                            System.out.println("x&y = " + (x&y));
                            System.out.println("x!y= " + (x|y));
                            System.out.println("x^y= " + (x^y));
                            System.out.println("x<<2= " + (x<<2));
                            System.out.println("x>>2= " + (x>>2));
                            System.out.println("x>>>2= " + (x>>>2));
                            
                        }
                    }