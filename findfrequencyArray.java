//WAP in Java to find Frequency of each element in the array?
import java.util.Scanner;
class frequency
                {
                    int a[];
                    int i, key, size, count = 0;
                    void getdata()
                    {
                        try (Scanner sc = new Scanner(System.in)) {
                            System.out.println("Enter size of the array: ");
                            size = sc.nextInt();
                            a = new int[size];
                            for(i = 0; i < a.length; i++)
                            {
                                System.out.println("Enter number");
                                a[i] = sc.nextInt();
                            }
                            System.out.println("Enter key: ");
                            key = sc.nextInt();
                            sc.close();
                        }
                    }
                    void output()
                    {
                        for(i = 0; i < a.length; i++)
                        {
                            if(a[i] == key)
                            {
                                count = count + 1;
                            }
                        }
                        System.out.println("Frequency" + count);
                    }
                }
class findfrequencyArray
                        {
                            public static void main(String args[])
                            {
                                frequency aa = new frequency();
                                aa.getdata();
                                aa.output();
                            }
                        }