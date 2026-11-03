/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t100204;

/**
 *
 * @author alisd
 */
public class T100204Q3 {
    public static void main(String[] args) {
         int f1 = 1;
         int f2 = 1;
         
         System.out.print(f1 + " \n" + f2 + " \n");
         
         for (int i = 3; i <= 10; i++){
             int fn = f1 + f2;
             System.out.println(fn + " ");
             
             //shift value
             f1 = f2;
             f2 = fn;
         }
         System.out.println();
    }
}
