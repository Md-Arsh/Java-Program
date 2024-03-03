//WAP in java to print the elements of an array present on even position?

class arrayPrintEven
                    {
                        public static void main(String args[])
                        {
                            int arr[] = new int[] {2, 3, 4, 5, 6, 8};
                            
                            for(int i = 1; i < arr.length; i += 2)
                            {
                                System.out.print(arr[i] + " ");
                            }
                        }
                    }