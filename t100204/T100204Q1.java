/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t100204;


/**
 *
 * @author alisd
 */
public class T100204Q1 {

    public static void main(String[] args) {
        //Q1 (a)
        int n = 1 ;
        while (Math.pow (n + 1, 3) <2000 ){
            n++;
        }
        System.out.println("The largest integer n^3 that is less than 2000 : " + n + " (where 12^3 = " + (int)Math.pow(12,3) + ")");
        //Q1 (b)
        for (int s = 1; s <= 12 ; s++){
            System.out.println(s + " squared = " + (s * s));
        }
        //Q1 (c)
        java.util.Random rand = new java.util.Random ();
        
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j <5; j++){
                int num = rand.nextInt(101); // 0 to 100 inclusive 
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        //Q1 (d)
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a given number : ");
        int givenNumber = scanner.nextInt ();
        int sum = 0;
        
        for (int k=1; k<= givenNumber; k++){
            sum += k;
        }
        System.out.println("The sum from 1 to "+ givenNumber +  " is : " + sum);
        //Q1 (e)
        double sumSeries = 0.0;
        for (int j = 1; j <= 25; j++){
            int numerator = j;
            int denominator = 26 - j;
                    sumSeries += (double) numerator / denominator;
        }
        System.out.printf("The sum of the series is: %.2f\n", sumSeries);
    }
    
}
    

