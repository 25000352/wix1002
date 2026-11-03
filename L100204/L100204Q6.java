/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L100204;
import java.util.Random;
/**
 *
 * @author alisd
 */
public class L100204Q6 {
   public static void main(String[] args) {
        Random rand = new Random();
        
        // Generates a non-negative random integer (e.g., up to 1,000,000)
        int number = rand.nextInt(1000000); 
        System.out.println("Generated number: " + number);
        
        int digitCount = 0;
        int temp = number;
        
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp > 0) {
                temp /= 10;
                digitCount++;
            }
        }
        
        System.out.println("Number of digits: " + digitCount);
    }
}
