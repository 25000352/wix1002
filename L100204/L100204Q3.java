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
public class L100204Q3 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        double sumX = 0;
        double sumX2 = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        while (true) {
            System.out.print("Enter a score [negative score to quit]: ");
            int score = scanner.nextInt();
            
            if (score < 0) {
                break; // Exit loop if a negative score is entered
            }
            
            count++;
            sumX += score;
            sumX2 += (score * score);
            
            if (score < min) {
                min = score;
            }
            if (score > max) {
                max = score;
            }
        }
        
        if (count > 1) { // Standard deviation requires at least 2 values (N - 1 denominator)
            double average = sumX / count;
            double variance = (sumX2 - (Math.pow(sumX, 2) / count)) / (count - 1);
            double stdDev = Math.sqrt(variance);
            
            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f\n", average);
            System.out.printf("Standard Deviation: %.2f\n", stdDev);
        } else if (count == 1) {
            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f\n", (double) sumX);
            System.out.println("Standard Deviation: Cannot be calculated with only 1 score.");
        } else {
            System.out.println("No valid scores were entered.");
        }
    }
}

// lecturer answer
//Scanner scan
// int max = 0;
//int min = 0;
//count = 0;
// sqr = 0
//int input = scan.nextInt());
//count ++
// for (int i = 0; ;i++)
//if (input < 0)
//break;
// if (max < input) 
//if (min > input min = input;
//sum += input;
//sqr= sqr += input * input
//}
//double average = sum/count;
//sd = Math.sqrt ((sqr - sum*sum/count)/(cnt-1.0));
//sout ((sqrt - sum*sum/count)/(count-1.0));
//System.out.println("Minimum Score: " + min);
//System.out.println("Maximum Score: " + max);
//System.out.printf("Average Score: %.2f\n", average);
//System.out.printf("Standard Deviation: %.2f\n", sd);
