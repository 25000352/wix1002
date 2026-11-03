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
public class L100204Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter interest in %: ");
        double annualInterestRate = scanner.nextDouble();
        
        System.out.print("Enter total number of month(s): ");
        int totalMonths = scanner.nextInt();
        
        double monthlyRate = annualInterestRate / (12 * 100);
        
        // Calculate Monthly Payment (M)
        double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -totalMonths));
        
        // Print table header matching sample output format
        System.out.printf("%-7s %-16s %-10s %-10s %-16s %-15s\n", 
                "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        
        double totalInterestAccumulated = 0.0;
        
        for (int n = 1; n <= totalMonths; n++) {
            // Principal portion due (Cn)
            double cn = monthlyPayment * Math.pow(1 + monthlyRate, -(1 + totalMonths - n));
            
            // Interest due (Ln)
            double ln = monthlyPayment - cn;
            
            // Remaining principal balance due (Rn) based on sheet formula
            double rn = (ln / monthlyRate) - cn;
            
            // Accumulate total interest
            totalInterestAccumulated += ln;
            
            // Handle floating-point precision for the final month balance to show 0.00
            if (n == totalMonths) {
                rn = 0.00;
            }
            
            System.out.printf("%-7d %-16.2f %-10.2f %-10.2f %-16.2f %-15.2f\n", 
                    n, monthlyPayment, cn, ln, rn, totalInterestAccumulated);
        }
    }
}
