public class lagestNum {
    public static void main(String args[])
    {
        int arr[] = new int[] {2, 9, 6, 5, 4 };
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
