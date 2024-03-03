//WAP in java to print the elements of an array present on odd position?

class arrayPrintOdd
                    {
                        public static void main(String args[])
                        {
                            int arr[] = new int[] {2, 4, 9, 8, 6, 7, 5, 9};

                            for(int i = 0; i < arr.length; i += 2)
                            {
                                System.out.print(arr[i] + " ");
                            }

                        }
                    }