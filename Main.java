import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        String name = "Saloni";
        String sir_name = "Saroha";
        System.out.println(name +" "+ sir_name);       // java concatenation.
        int num1 = 123;
        int num2 = 134;
        double final_value = num1 + num2;
        System.out.println(final_value);              // java casting
        // Arrays
       int[] num = {34,56,67,98,23};
       System.out.println(num[2]);
       String[] values = {"saloni", "tanu", "riya"};
       System.out.println(values[2]);
       int[][] marks = {{12,54,87},{34,65,90}};
       System.out.println(marks[1][2]);              // Two dimensional array.

        // Taking input from user.
       int x,y,sum;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number :-");
       x = sc.nextInt();
       System.out.println("Enter second number :-");
       y = sc.nextInt();
       sum = x + y;
       System.out.println("The sum of two numbers is " + sum);

       Scanner res = new Scanner(System.in);
       System.out.println("Enter your name");
       String my_name = res.next(); // It only print saloni not saloni saroha.So if you want to print whole line then we use nextLine() function.
       System.out.println(my_name);
       Scanner response = new Scanner(System.in);
        System.out.println("Enter your good name please !");
       String good_name = response.nextLine(); // For print whole line code.
       System.out.println(good_name);

       // Operators.
       // Addition, Subtarction, Multiplication, Division.
       int value1 = 56;
       int value2 = 14;
       System.out.println(value1 + value2);
       String nm = "Saloni";                       // Strings can only concatenate with strings.
       String a = "7";
       System.out.println(nm + a);

       double price = 12;
       double expected_price = 2;
       System.out.println(price%expected_price); // Modulo(%) operator simply gives remainder wheras divison operator(/) gives quotient.

       // Urinary operator
       int numb = 3;
       
       System.out.println(numb++);
       System.out.println(++numb);

        
       // Maths class
       System.out.println(Math.max(6,7));
       System.out.println(Math.min(3,4));

       // Conditionals statement.
       // Taking input from user.
       Scanner age = new Scanner(System.in);
       System.out.println("Enter your age :- ");
       int my_age = age.nextInt();
       System.out.println("age is " + my_age);
       if(my_age> 18 && my_age<60){
        System.out.println("Person is physically fit");
       }
       else{
        System.out.println("Person needs to take some initiative for fitness.");
       }

       
      // Switch statement.
      Scanner days = new Scanner(System.in);
      System.out.println("Enter day number");
      int day = days.nextInt();

      switch(day){
        case 1:
            System.out.println("Monday");
            break;
      
       case 2:
            System.out.println("Tuesday");
            break;
      
       case 3:
            System.out.println("Wednesday");
            break;
      
       case 4:
            System.out.println("Thursday");
            break;
      
       case 5:
            System.out.println("Friday");
            break;
       case 6:
            System.out.println("Saturday");
            break;
      
       case 7:
            System.out.println("Sunday");
            break;
      
      default:
        System.out.println("everday is fun ");
      }

    }
}