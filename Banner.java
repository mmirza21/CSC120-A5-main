/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = "                            HAVE A GREAT DAY!";
        
    }

    /*
     * Modify this method to print a decorative banner, resized to fit the message
     */
    public void display() {
        String message = this.message; 
        // Unfortunately this code only works to symmetrically reposition the banner if
        // and only if the length of the message is similar to the length of the asterisks
        if (message.length()>18 || message.length()<22){
            for(int i = 0; i < (message.length()/4); i ++){
                System.out.print(" ");
            }
            System.out.println("           ****************************");
            for(int i = 0; i < (message.length()/4); i ++){
                System.out.print(" ");
            }
            System.out.println("    ********* ~~~~~~~~~~~~~~~~~~~~~~~ ********");
            System.out.println(message); 
            for(int i = 0; i < (message.length()/4); i ++){
                System.out.print(" ");
            }
            System.out.println("    ******** ~~~~~~~~~~~~~~~~~~~~~~~~ ********");
            for(int i = 0; i < (message.length()/4); i ++){
                System.out.print(" ");
            }
            System.out.println("           ****************************");}
        else{
            System.out.println("           ****************************");
            System.out.println("    ********* ~~~~~~~~~~~~~~~~~~~~~~~~ ********");
            System.out.print(this.message); 
            System.out.println("    ******** ~~~~~~~~~~~~~~~~~~~~~~~~ ********");
            System.out.println("           ****************************");
        }

    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
