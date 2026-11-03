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
public class L100204Q8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(101); // Generates a random integer from 0 to 100[cite: 12]
        
        System.out.println("Random n = " + n);
        System.out.print("The first " + n + " prime numbers: ");
        
        if (n <= 0) {
            System.out.println("None (n is 0).");
            return;
        }
        
        int count = 0;
        int candidate = 2;
        
        while (count < n) {
            if (isPrime(candidate)) {
                System.out.print(candidate + " ");
                count++;
            }
            candidate++;
        }
        System.out.println();
    }
    
    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
