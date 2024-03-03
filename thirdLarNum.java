class thirdLarNum
                {
                    public static void main(String args[])
                    {
                        int arr[] = new int[] {2, 3, 1, 4, 5, 6, 9, 7, 12, 13};
                        int temp = 0, i, j;
                        // int pr[] = new int[arr.length];
                        
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
                        System.out.println();
                        for(i = 0; i < arr.length; i++)
                        {
                            if(arr[i] == arr[2])
                            {
                                System.out.println("Third Largest number in array is " + arr[i]);
                            }
                        }
                    }
                }