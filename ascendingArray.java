//WAP in java to sort the elements of an array in ascending order?

class ascendingArray
                    {
                        public static void main(String args[])
                        {
                            int arr[] = new int[] {2, 9, 4, 3, 6};
                            int i, j;
                            int temp;
                            for(i = 0; i < arr.length; i++)
                            {
                                for(j = i + 1; j < arr.length; j++)
                                {
                                    if(arr[i] > arr[j])
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