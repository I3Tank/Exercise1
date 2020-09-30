package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a  ='Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int intA = (int) a;
        int intD = (int) d;
        int intE = (int) e;
        int intF = (int) f;
        int intG = (int) g;
        int intH = (int) h;

        System.out.println(intA + b + c + intD + intE + intF + intG + intH);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println(number1 + number2);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int difference = number1 - number2;

        if(difference < 0){
            difference = difference * -1;
        }

        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");
        System.out.println("After Swap:");
        System.out.println("x: " + (number1 + difference));
        System.out.println("y: " + (number2 - difference));
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.print("n1: ");
        System.out.print("n2: ");

        if(number1 > number2){
            System.out.println("n1 > n2");
        }
        else if(number1 < number2){
            System.out.println("n2 > n1");
        }
        else if(number1 == number2){
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();

        if(revenue < 0 || revenue >= 100000){
            System.out.println("Invalid Revenue");
        }
        else if(0 <= revenue && revenue < 20000){
            System.out.println("Poor Sales Revenue");
        }
        else if(20000 <= revenue && revenue < 50000){
            System.out.println("Average Sales Revenue");
        }
        else if(50000 <= revenue && revenue < 80000){
            System.out.println("Good Sales Revenue");
        }
        else if(80000 <= revenue && revenue < 100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        double commissionRate;
        System.out.print("Enter CommissionClass: ");
        int commissionClass = scanner.nextInt();

        switch(commissionClass){
            case 1:
                commissionRate = 0.01;
                break;
            case 2:
                commissionRate = 0.02;
                break;
            case 3:
                commissionRate = 0.03;
                break;
            case 4:
                commissionRate = 0.04;
                break;
            default:
                commissionRate = 0;
        }
        System.out.println("Your Commission Rate was set to " + commissionRate);
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year: ");
        int leapYear = scanner.nextInt();
        if (leapYear % 4 == 0 && ((leapYear % 100 != 0) || (leapYear % 400 == 0))){
            System.out.println("Leapyear");
        }
        else{
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int toReverse = scanner.nextInt();
        int reversed;
        int a;
        int b;
        int c;

        c = toReverse % 10;
        b = ((toReverse % 100) - c)/10;
        a = ((toReverse % 1000) - (toReverse % 100)) / 100;

        reversed = (c * 100) + (b * 10) + a;

        System.out.println(reversed);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers (ints, floats,...)");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}