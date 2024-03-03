import java.util.Scanner;
public class SwitchStatement 
                            {
                                public static void main(String args[])
                                {
                                    char color;
                                    Scanner sc = new Scanner(System.in);
                                    System.out.println("Enter your Choice \n r-Red Color, g-Green color, b-Blue color, w-White color:");
                                    color = sc.next().charAt(0);
                                    sc.close();

                                    switch(color)
                                    {
                                        case 'r':
                                        System.out.println("for Red");
                                        break;

                                        case 'g':
                                        System.out.println("for Green");
                                        break;

                                        case 'b':
                                        System.out.println("for Blue");
                                        break;

                                        case 'w':
                                        System.out.println("for White");
                                        break;

                                        default:
                                        System.out.println("Invalid choice:");
                                    }
                                }                            
                            }

//                             import java.util.Scanner;

// public class ColorChoice {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         char color;

//         System.out.println("Enter your Choice \n r-Red Color, g-Green color, b-Blue color, w-White color:");
//         String input = sc.nextLine();

//         if (input.length() > 0) {
//             color = input.charAt(0);
//             System.out.println("You chose " + getColorName(color));
//         } else {
//             System.out.println("Invalid input");
//         }

//         sc.close();
//     }

//     private static String getColorName(char color) {
//         switch (color) {
//             case 'r':
//                 return "Red";
//             case 'g':
//                 return "Green";
//             case 'b':
//                 return "Blue";
//             case 'w':
//                 return "White";
//             default:
//                 return "Unknown color";
//         }
//     }
// }

