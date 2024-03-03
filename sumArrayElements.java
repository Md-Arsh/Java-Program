//WAP in java to print the sum of all the items of the array?

class sumArrayElements
                        {
                            public static void main(String args[])
                            {
                                int arr[] = new int[] {2, 3, 4, 5, 6};
                                int  i, sum = 0;
                                for(i = 0; i < arr.length; i++)
                                {
                                    sum = sum + arr[i];
                                }
                                System.out.print("Sum of all the elements of an array: " + sum);
                            }
                        }