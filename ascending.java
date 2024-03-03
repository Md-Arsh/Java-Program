import java.util.Scanner;
class order
            {
                int arr[];
                int i, j, temp = 0;
                int size;
                void input()
                {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter size of the array: ");
                    size = sc.nextInt();

                    arr = new int[size];

                    for(i = 0; i < size; i++)
                    {
                        System.out.print("Enter number: ");
                        arr[i] = sc.nextInt();
                    }
                    sc.close();
                }
                void show()
                {
                    for(i = 0; i < size; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
                }

                

                void ascendingOrder()
                {
                    for(i = 0; i < size; i++)
                    {
                        for(j = i + 1; j < size; j++)
                        {
                            if(arr[i] > arr[j])
                            {
                                temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                }
                void display()
                {
                    for(i = 0; i < size; i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
class ascending
                {
                    public static void main(String arshad[])
                    {
                        order obj = new order();
                        obj.input();
                        obj.show();
                        System.out.println();
                        obj.ascendingOrder();
                        obj.display();

                        
                    }
                }