//WAP in java to print the largest element in an array?

class arrayLargest
                    {
                        public static void main(String args[])
                        {
                            int arr[] = new int[] {2, 3, 4, 6};
                            int i;
                            int max = arr[0];
                            for(i = 0; i < arr.length; i++)
                            {
                                if(arr[i] > max)
                                {
                                     max = arr[i];
                                }
                            }
                                System.out.println(max);
                        }
                    }