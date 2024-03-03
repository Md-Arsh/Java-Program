

class Duplicate
                {
                    public static void main(String args[])
                    {
                        int arr[] = new int[]{2, 3, 4, 5, 6, 5, 4};
                        int pos = 0;
                        for(int i = 0; i < arr.length; i++)
                        {
                            for(int j = i + 1; j < arr.length; j++)
                            {
                                if(arr[i] == arr[j])
                                {
                                    pos = i + 1;
                                    System.out.println(arr[j] + " " + "is a duplicate number position at" + " " + pos);
                                }
                            }
                        }
                    }
                }

// class Duplicate {
//     public static void main(String args[]) {
//         int arr[] = new int[]{2, 3, 3, 5, 5, 8};

//         System.out.print("Duplicate elements: ");
//         for (int i = 0; i < arr.length - 1; i++) {
//             if (arr[i] == arr[i + 1]) {
//                 System.out.print(" " + arr[i]);
//             }
//         }
//     }
// }