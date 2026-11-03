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
public class L100204Q5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int player1Score = 0;
        int player2Score = 0;
        
        System.out.println("--- Starting Dice Game ---");
        
        while (player1Score <= 100 && player2Score <= 100) {
            // Player 1 Turn
            System.out.println("\nPlayer 1's turn:");
            boolean player1Again;
            do {
                player1Again = false;
                int roll = rand.nextInt(6) + 1; // 1 to 6
                System.out.println("Player 1 rolled: " + roll);
                
                if (roll == 6) {
                    player1Score += 6;
                    System.out.println("Rolled a 6! Player 1 gets 6 points and rolls again.");
                    player1Again = true;
                } else {
                    player1Score += roll;
                }
                System.out.println("Player 1 Total Score: " + player1Score);
                
                if (player1Score > 100) {
                    System.out.println("\nPlayer 1 wins the game with " + player1Score + " points!");
                    return;
                }
            } while (player1Again);
            
            // Player 2 Turn
            System.out.println("\nPlayer 2's turn:");
            boolean player2Again;
            do {
                player2Again = false;
                int roll = rand.nextInt(6) + 1; // 1 to 6
                System.out.println("Player 2 rolled: " + roll);
                
                if (roll == 6) {
                    player2Score += 6;
                    System.out.println("Rolled a 6! Player 2 gets 6 points and rolls again.");
                    player2Again = true;
                } else {
                    player2Score += roll;
                }
                System.out.println("Player 2 Total Score: " + player2Score);
                
                if (player2Score > 100) {
                    System.out.println("\nPlayer 2 wins the game with " + player2Score + " points!");
                    return;
                }
            } while (player2Again);
        }
    }
}
