class arraysmallest
                    {
                        public static void main(String args[])
                        {
                            int arr[] = new int[] {2, 3, 4, 5, 6};
                            int i; 
                            int max = arr[0];

                            for(i = 0; i < arr.length - 1; i++)
                            {
                                if(arr[i] < max)
                                {
                                    max = arr[i];
                                }
                            }
                        }
                    }
