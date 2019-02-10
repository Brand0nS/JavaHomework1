/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a15246287;
/**
 *
 * @author Brandon
 */

/** Brandon Scott**/
import java.util.Scanner;
import java.lang.Math; 
public class A15246287 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        quadraticEquation();
        printSomething();
        
        
        
               
    }
    
    
       public static int quadraticEquation(){
           System.out.println("Enter coefficients for the quadratic equation:"); //Requests user to input information
        Scanner A,B,C; //Creation of Scanner objects
        A = new Scanner(System.in); //Create the three values (a, b and c) for the setting up of the quadratic equation
        B = new Scanner(System.in);
        C = new Scanner(System.in);
        int aValue = A.nextInt();//Taking in input
        int bValue = B.nextInt();
        int cValue = C.nextInt();
        System.out.println("a:"+aValue); //Output the value of a, b and c.
        System.out.println("b:"+bValue);
        System.out.println("c:"+cValue);
        //Quadratic Equation Math (First Solution)
        
        double aSolution;
        aSolution = (-(bValue) - Math.sqrt((bValue*bValue)-4*aValue*cValue))/ 2*aValue;
       
        //Quadratic Equation Math (Second Solution)
         double bSolution;
        bSolution = (-(bValue) + Math.sqrt((bValue*bValue)-4*aValue*cValue))/ 2*aValue;
        
        System.out.println("The first solution (subtracting) is:"+aSolution); //Print out value for A
        System.out.println("The second solution (adding) is:"+bSolution); //Print out value for B
        
        
       return 0;
       }
    
    
        
        public static int printSomething(){
            System.out.println("This problem computes the Hailstone sequences.");
            System.out.println("Please enter a positive integer");
            int numberOfTries=0;
            Scanner Input;
            Input = new Scanner(System.in);
            int n = Input.nextInt();
            
            if(n==1){
                System.out.println("This process took"+numberOfTries+"times to reach 1");
                 
            }
            
           while(n!=1){
            if(n%2==0) {
                  System.out.print(n+" is even, so take half=");  
                   n=n/2;
                   System.out.println(n);
                  numberOfTries++;
            }
           else {
           System.out.print(n+ " is odd, so I make 3n+1=");
           n=(n*3)+1;
           System.out.println(n);
            numberOfTries++;
            }
          }
            return 0;
           
          }
       
        //printSomething();
    
    public static int interceptMessage(){
    
    
    
   
        return 0;
}
    
}
