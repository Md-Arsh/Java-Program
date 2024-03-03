//WAP in java to find smallest number in an array?

class smallestNumber
                    {
                        public static void main(String args[])
                        {
                            int i, j;
                            int arr[] = new int[] {4, 6, 8, 9, 2, 3};
                            for(i = 0; i < arr.length; i++)
                            {
                                for(j = i + 1; i < arr.length; i++)
                                {
                                    if(arr[i] > arr[j])
                                    {
                                        int temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                    }
                                }
                            }
                            for(i = 0; i < arr.length; i++)
                            {
                                if(arr[i] == arr[0])
                                {
                                    System.out.println("Smallest Number in array is: " + arr[i]);
                                    break;
                                }
                            }
                        }
                    }