//WAP in java to print 2nd Largest number in an array?

class secondLarNum
                    {
                        public static void main(String args[])
                        {
                            int arr[] = new int[] {4, 9, 6, 3, 2, 16, 12, 19};
                            int i, j, temp = 0;

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
                                if(arr[i] == arr[1])
                                {
                                    System.out.println("Second Largest number is: " + " " + arr[i]);
                                }
                            }
                        }
                    }