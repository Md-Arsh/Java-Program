public class descendingArray 
                            {
                                public static void main(String args[])
                                {
                                    int arr[] = new int[] {2, 3, 4, 5};
                                    int temp = 0;
                                    int i, j; 
                                    for(i = 0; i < arr.length; i++)
                                    {
                                        for(j = i + 1; j < arr.length; j++)
                                        {
                                            if(arr[i] < arr[j])
                                            {
                                                temp = arr[i];
                                                arr[i] = arr[j];
                                                arr[j] = temp;
                                            }
                                        }
                                    }
                                    for(i = 0; i < arr.length; i++)
                                    {
                                        System.out.print(arr[i] + " ");
                                    }
                                }
                            }
