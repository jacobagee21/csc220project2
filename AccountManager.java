import java.util.Scanner;

public class AccountManager {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        // scanner object
      Scanner userInput = new Scanner(System.in);


      //make profile object here

        //manually testing

       // UserProfile user1 = new UserProfile("tsmith",  "tsmith@email.com");




        //make null object
        UserProfile user1 = null;








        while(true) {


            System.out.println("1. Create User Profile");
            System.out.println("2. Update Bio");
            System.out.println("3. Show profile details");
            System.out.println("4. Exit");
            System.out.println("Enter your choice ");

             int choice = userInput.nextInt();
             //clear buffer
            userInput.nextLine();




            //switch statement

            switch(choice){


                case 1:
                    System.out.print("Enter username: ");
                    String username = userInput.nextLine();
                    System.out.print("Enter email: ");
                    String email = userInput.nextLine();

                     user1 = new UserProfile(username, email);
                    System.out.println("User profile created successfully!");
                    break;

                case 2:
                    System.out.println("We are in option 2");
                    break;

                case 3:
                    System.out.println("We are in option 3");
                    break;

                case 4:
                    System.out.println("We are in option 4");
                    return;

                default:
                    System.out.println("Wrong input.");

            }//ends switch

        } // ends while

        }





    }

