// WAP for a method without parameters but with a return type
class Sample
            {
                private double n1, n2;
                Sample(double x, double y)
                {
                    n1 = x;
                    n2 = y;
                }
                double sum()
                {
                    double result = n1 + n2;
                    return result;
                }
            }
class FnDefaultArgunment 
                        {
                            public static void main(String args[])
                            {
                                Sample obj = new Sample(12.4, 12.2);
                                double res = obj.sum();
                                System.out.println("Sum= " + res);
                            }
                        }
