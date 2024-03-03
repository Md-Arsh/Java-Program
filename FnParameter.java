// WAP for a method with two parameters and a return type?

class Methods 
                {
                    double sum(double n1, double n2)
                    {
                        double res = n1 + n2;
                        return res;
                    }
                }
class FnParameter
                 {
                    public static void main(String[] args)
                    {
                        Methods obj = new Methods();
                        double x = obj.sum(12.2, 12.3);
                        System.out.println("Sum= " + x);
                    }
                 }