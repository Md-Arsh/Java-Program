//WAP for a method without parameters and without a return type?

class DefaultParameter 
                                {
                                    private double n1, n2;
                                    DefaultParameter(double x, double y)
                                    {
                                        n1 = x;
                                        n2 = y;
                                    }
                                    void sum()
                                    {
                                        double result = n1 + n2;
                                        System.out.println("Sum= " + result);
                                    }
                                }
class FnDefaultParameter
                            {
                                public static void main(String args[])
                                {
                                    DefaultParameter obj = new DefaultParameter(10, 22.5);
                                    obj.sum();
                                }
                            }
