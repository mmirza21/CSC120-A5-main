/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Shirt {

    /*
     * Modify this method to print ASCII Art Shirt
     */
    public void display() {
        System.out.println("      ------------------");
        System.out.println("     /        |o        \\");
        System.out.println("    /  /|     |      |\\  \\");
        System.out.println("   /__/ |     |o     | \\__\\");
        System.out.println("        |     |      |");
        System.out.println("        |     |o     |");
        System.out.println("        |_____|______|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
