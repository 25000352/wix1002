/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t100204;
import java.util.Scanner;
/**
 *
 * @author alisd
 */
public class Lecturer_others_answer {
    public static void main (String[] args){
        //Q1a
        int i=1, n=i*i*i;
        for (;n<2000; i++)
            n = i*i*i;
        System.out.println("The largest n where n cube less than 2000 is " + (i-2));
        //Q1b
        int j ;
        final int DOZEN = 12;
        for (j=1;i<DOZEN;j++)
            System.out.print(i*i + ", ");
        System.out.println("i*i");
        //Q2d
        i=0;
        while (i++<10){
            if (i==10)
                System.out.println("Program end");
        }
        //Q4 ethan
        String display = "hello";
        for (int l = display.length (); l > 0; l--){
            System.out.println(display.charAt(l-1));
        }
        //Q4 lect
        String sentence;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        sentence = k.nextLine ();
        int count;
        count = sentence.length();
        for(int c=count-1;c>=0;c--)
            System.out.print (sentence.charAt(c));
        System.out.println();
    }
}
