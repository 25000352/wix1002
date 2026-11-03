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
public class L100204Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();
        
        int totalSum = 0;
        int currentSum = 0;
        
        for (int i = 1; i <= n; i++) {
            currentSum += i;   // Adds current number to the inner sub-sum (e.g., 1, 1+2, 1+2+3...)
            totalSum += currentSum; // Accumulates the grand total
        }
        
        System.out.println("The sum of the series is: " + totalSum);
    }
}
// Lect ans
// for (int i=1; i<=n, i++){
//  for (int j = 1 j <= i, j++){
//     sum += j
//}
//sum += i