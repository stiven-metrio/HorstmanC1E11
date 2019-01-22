/**
 * Cay S. Horstmann -- Chapter 1
 * Exercise #11
 * Write a program that reads a line of text and prints all characters 
 * that are not ASCII, together with their Unicode values.
 */
package java_ex11_asciiunicode;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Java_Ex11_AsciiUnicode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            String ascii = Integer.toHexString(c);
            if(true){
                System.out.printf("%s\t%s%n",c,ascii);
            }
        }
    }
    
}

//It needs to be fixed for not ascii inputs
