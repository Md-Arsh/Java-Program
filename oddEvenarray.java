//WAP in java to print odd and even numbers from an array?

class oddEvenarray
                    {
                        public static void main(String args[])
                        {
                            int[] arr = new int[] {2, 4, 3, 5, 9, 6, 8, 7};

                            System.out.println("Even Numbers: ");
                            for(int i = 0; i < arr.length; i++)
                            {
                                if(arr[i] % 2 == 0)
                                {
                                    System.out.println("Een number found at index" + " " + i + " " + arr[i]);
                                }
                            }
                            System.out.println();

                            System.out.println("Odd Numbers: ");
                            for(int i = 0; i < arr.length; i++)
                            {
                                if(arr[i] % 2 != 0)
                                {
                                    System.out.println("Odd number found at index" + " " + i + " " + arr[i]);
                                }
                            }
                        }
                    }