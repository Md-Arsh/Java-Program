//WAP in java to print second smallest number in java?

class secondSmallNum
                        {
                            public static void main(String args[])
                            {
                                int a[] = new int[] {7, 9, 6, 8, 3, 2, 1};
                                int i, j, temp = 0;

                                for(i = 0; i < a.length; i++)
                                {
                                    System.out.print(a[i] + " ");
                                }

                                System.out.println();

                                for(i = 0; i < a.length; i++)
                                {
                                    for(j = i + 1; j < a.length; j++)
                                    {
                                        if(a[i] > a[j])
                                        {
                                            if(a[i] == a[j])
                                            {
                                                break;
                                            }
                                            temp = a[i];
                                            a[i] = a[j];
                                            a[j] = temp;
                                        }
                                    }
                                }
                                for (i = 0; i < a.length; i++) {
                                    System.out.println("Checking element at index " + i + ": " + a[i]);
                                    if (a[i] == a[1]) {
                                        System.out.println("Found matching element: " + a[i]);
                                        break;  // Break the loop after printing
                                    }
                                }
                                
                            }
                        }