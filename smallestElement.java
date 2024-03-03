//WAP in java to print smallest number in an array?

class smallestElement
                    {
                        public static void main(String args[])
                        {
                            int arr[] = new int[] {9, 8, 3, 7, 2, 4};
                            int max = arr[0];

                            for(int i = 0; i < arr.length; i++)
                            {
                                if(arr[i] < max)
                                {
                                    max = arr[i];
                                }
                            }
                            System.out.println(max);
                        }
                    }