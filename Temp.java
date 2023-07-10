import java.util.Scanner;
import java.util.Arrays;
 
public class Temp{
  public static void printName(String name){
    System.out.println(name);
  }
  public static void printSum(int a, int b){
    int sum  = a + b;
    System.out.println(sum);
  }
    public static void main(String[] args){
        // loops :- For repition work
        for(int i = 0; i<=50; i++){           // For loop
          System.out.println(i);
        }
       // While loop
        int i = 100;
        while(i>=1){
          System.out.println(i);
          i--;
        }
        // Do while loop
        int k = 40;
        do{
          System.out.println(k);
          k--;
        } while(k>=1);

        // Taking input from user.
        Scanner sc = new Scanner(System.in);
        int number;
        do{
          System.out.println("Input a number");
           number = sc.nextInt();
          System.out.println(number);

        } while(number>=0);
        System.out.println(" The END");

        // Break and continue statements
        for(int j=0; j<=30; j++){
          if(j==20){
            break; // For exit from loop.
          }
          else{
             System.out.println(j);
          }
          
        }
        // Exception Handling
        int[] marks = {23,56,78,98};
        //System.out.println(marks[5]);
        //System.out.println("saloni saroha"); // This is not print because above arrays is exception showing length is 4 but we we to get 5 index so after this exception we cannot print anything.To overcome this we use catch and try method.
        try{
          System.out.println(marks[5]);
        }
        catch(Exception exception){
          // do something after catching
        }
        System.out.println("My name is saloni saroha"); // This prints after exception handling.

        // Class and Methods
       printName("saloni");
        printName("tanu");
         printName("riya");
          printName("sakshi");
           printName("rahul");
            printName("sonam");
       printSum(2,4);
    }
}