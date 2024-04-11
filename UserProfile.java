public class UserProfile {




    //setup instance variables
        private String username;
        private String email;
        private String bio;
        //constructor


    public UserProfile(String username, String email){
        this.username = username;
        this.email = email;
        //set bio to empty
        this.bio = "";

    }

    public UserProfile(String bio) {
    }


    // put setters in getters


    //display method
    public void displayProfile(){
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Bio: " + bio);

    }


        
    }

