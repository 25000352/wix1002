/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L100204;
import java.util.Scanner;
/**
 *
 * @author alisd
 */
public class L100204Q1 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();
        
        System.out.print("The factors are: ");
        for (int i = 1; i <= num; i++) {
        // for (initalisation; condition (sampai mana); increment++/decreament--)
            if (num % i == 0) {
                System.out.print(i);
                if (i < num) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
    
}
