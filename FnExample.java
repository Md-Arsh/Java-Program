import java.util.Scanner;  
public class FnExample 
    {  
        public static int add(int a, int b) 
            {  
                return a + b;  
            } 
        public static void main(String[] args) 
        {  
            Scanner scanner = new Scanner(System.in);  
            
            
            System.out.print("Enter a number: ");  
            int num1 = scanner.nextInt();  
            
            System.out.print("Enter another number: ");  
            int num2 = scanner.nextInt(); 
            scanner.close(); 

            int sum = add(num1, num2);  

            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");

             
        } 
    } 
