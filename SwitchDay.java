import java.util.Scanner;
class SwitchSt
                    {
                        String day;

                        SwitchSt(int choice)
                        {
                            switch(choice)
                            {
                                case 1:
                                day = "Sunday";
                                break;

                                case 2:
                                day = "Monday";
                                break;

                                case 3:
                                day = "Tuesday";
                                break;

                                case 4:
                                day ="Wednesday";
                                break;

                                case 5:
                                day = "Thursday";
                                break;

                                case 6:
                                day = "Friday";
                                break;

                                case 7:
                                day = "Saturday";
                                break;

                                default:
                                System.out.println("Invalid choice:");

                            }
                        }
                         

                    }
class SwitchDay
                    {
                        public static void main(String args[])
                        {
                            int ch;
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Enter your choice: \n 1.Sunday, 2.Monday, 3.Tuesday, 4.Wednesday, 5.Thursday, 6.Friday, 7.Saturday");
                            ch = sc.nextInt();
                            sc.close();

                            SwitchSt aa = new SwitchSt(ch);
                            
                            System.out.println("Selected day= " + aa.day);
                         
                        }
                    }