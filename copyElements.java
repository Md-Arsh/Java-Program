//WAP in java to copy all elements one array to another array?
import java.util.Scanner;
class copyElements
                  {
                    public static void main(String args[])
                    {
                        int i;
                        int a[];
                        int b[];
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Enter size of the array: ");
                        int size = sc.nextInt();
                        a = new int[size];
                        sc.close();
                        for(i = 0; i < size; i++)
                        {
                            System.out.print("Enter number: " + " ");
                            a[i] = sc.nextInt();
                        }
                        b = new int[size];
                        for(i = 0; i < size; i++)
                        {
                            b[i] = a[i];
                            
                        }
                        System.out.println("Elements of second array: ");
                        for(i = 0; i < size; i++)
                        {
                            System.out.println(b[i] + " ");
                        }
                        
                    }
                  }