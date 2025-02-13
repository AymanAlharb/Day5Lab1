import java.util.Scanner;

//Lab1
//Ayman Alharbi
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input
//        System.out.println("Input the first number: ");
//        int num1 = input.nextInt();
//        System.out.println("Input the second number: ");
//        int num2 = input.nextInt();
//        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
//        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.
//        System.out.println("input a number: ");
//        int num = input.nextInt();
        //It's better to start from 1 not 0, because num*0 is not required in the problem statement
//        for(int i = 1; i <= 10; i++){
//            System.out.println(num + " x " + i + " = " + (i*num));
//        }
//        3. Write a Java program to print the area and perimeter of a circle.
        //Save the pi in a double variable because we need in the calculation of the area and perimeter.
//        double pi = 3.1415926535;
//        System.out.println("Please Enter the Radius: ");
//        double rad = input.nextDouble();
//        System.out.println("Perimeter is = " +(2*pi*rad));
//        System.out.println("Area is = " +  (pi*(rad*rad)));
//        4. Java program to find out the average of a set of integers
//        System.out.println("Please enter the count of numbers: ");
//        int cntOfnum = input.nextInt();
//        //The sum of the numbers need to be in a double variable so we can latter calculate the avg since there is a chance that the avg is a real number.
//        double sum = 0;
//        int num = 0;
//        for(int i = 0; i < cntOfnum; i++){
//            num = input.nextInt();
//            sum += num;
//        }
//        System.out.println("The average is: " + (sum/cntOfnum));
//        5. Write a Java program that accepts three integers as input, adds the first two integers
//       together, and then determines whether the sum is equal to the third integer.
//        System.out.println("Please input the first number: ");
//        int num1 = input.nextInt();
//        System.out.println("Please input the second number: ");
//        int num2 = input.nextInt();
//        System.out.println("Please input the third number: ");
//        int num3 = input.nextInt();
//        if(num1 + num2 == num3) System.out.println("True");
//        else System.out.println("False");
//        6. Write a Java program to reverse a word.
//        System.out.println("Please input a word: ");
//        String str = input.next();
//        //Used the StringBuilder class to benefit from the reverse method.
//        StringBuilder word = new StringBuilder(str);
//        System.out.println(word.reverse());
//        7 - Java program to check whether the given number is even or odd
//        System.out.println("Please enter a number: ");
//        int num = input.nextInt();
//        if(num%2 == 1) System.out.println("The number is odd");
//        else System.out.println("The number is even");
//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
//        System.out.println("Please enter temperature in Centigrade: ");
//        int temperatureInC = input.nextInt();
//        double fahrenheit = ((9/5.0) * temperatureInC) + 32;
//        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//        System.out.println("Please input a string: ");
//        //Used nextLine since the string can have spaces in it.
//        String str = input.nextLine();
//        System.out.println("Please input a number: ");
//        int num = input.nextInt();
//        //Used the build in method charAt to access the character at the index.
//        System.out.println(str.charAt(num));
//        10. Write a Java program to print the area and perimeter of a rectangle
//        System.out.println("Please Enter the width: ");
//        double width = input.nextDouble();
//        System.out.println("Please Enter the height: ");
//        double height = input.nextDouble();
//        System.out.println("Area is " + width + " x " + height + " = " + (width*height));
//        System.out.println("Perimeter is 2 " + " x (" + width + " + " + height + ") = " + (2 * (width+height)));
//        11. Write a Java program to compare two numbers.
//        System.out.println("Please enter the first number");
//        int num1 = input.nextInt();
//        System.out.println("Please enter the second number");
//        int num2 = input.nextInt();
//        if(num1 == num2) System.out.println(num1 + " == " + num2);
//        else System.out.println(num1 + " != " + num2);
//        if (num1 < num2) System.out.println(num1 + " < " + num2);
//        else System.out.println(num1 + " > " + num2);
//        if (num1 <= num2) System.out.println(num1 + " <= " + num2);
//        else System.out.println(num1 + " >= " + num2);
//        12. Write a Java program to convert seconds to hours, minutes and seconds
//        System.out.println("Please input the seconds: ");
//        int seconds = input.nextInt();
//        int minutes = seconds / 60;
//        int hours = minutes / 60;
//        //The remaining seconds.
//        seconds %= 60;
//        //The remaining minutes
//        minutes %= 60;
//        System.out.println(hours + ":" + minutes + ":" + seconds);
//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.
//        System.out.println("Please enter the first number: ");
//        int num1 = input.nextInt();
//        System.out.println("Please enter the second number: ");
//        int num2 = input.nextInt();
//        System.out.println("Please enter the third number: ");
//        int num3 = input.nextInt();
//        System.out.println("Please enter the fourth number: ");
//        int num4 = input.nextInt();
//        //We do not need to compare all the numbers with each other(if a = 1, and a == b, than b = 1, if b == c, than a == c and c == 1 as well)
//        if(num1 == num2 && num2 == num3 && num3 == num4) System.out.println("Numbers are equal!");
//        else System.out.println("Numbers are not equal!");


    }
}