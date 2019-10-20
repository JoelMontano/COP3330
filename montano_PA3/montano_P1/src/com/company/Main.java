package com.company;
import java.security.SecureRandom;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void printQuestion(int num1, int num2, int cond){
        if(cond == 1)
            System.out.printf("How much is %d + %d",num1,num2);
        if(cond == 2)
            System.out.printf("How much is %d * %d",num1,num2);
        if(cond == 3)
            System.out.printf("How much is %d - %d",num1,num2);
        if(cond == 4)
            System.out.printf("How much is %d / %d",num1,num2);
    }
    public static int getAnswer(Scanner scnr){
        int input = scnr.nextInt();
        return input;
    }
    public static double getAnsdouble(Scanner scnr){
        double input = scnr.nextDouble();
        return input;
    }
    public static int menu(Scanner scnr){
        int input;

        System.out.println("Menu:");
        System.out.println("1: Addition Problems Only");
        System.out.println("2: Multiplication Problems Only");
        System.out.println("3: Subtraction Problems Only");
        System.out.println("4: Division Problems Only");
        System.out.println("5: Random");
        System.out.println("6: Exit");
        input = scnr.nextInt();

        return input;
    }
    public static void addition(int difficulty, int cond, Scanner scnr){
        SecureRandom rand = new SecureRandom();
        int randInt1=0;
        int randInt2=0;
        int wrong = 0;
        int right = 0;
        int counter = 0;
        while(counter < 10)
        {
            if (difficulty == 1) {
                randInt1 = rand.nextInt(9)+1;
                randInt2 = rand.nextInt(9)+1;
            } else if (difficulty == 2) {
                randInt1 = rand.nextInt(91) + 10;
                randInt2 = rand.nextInt(91) + 10;
            } else if (difficulty == 3) {
                randInt1 = rand.nextInt(901) + 100;
                randInt2 = rand.nextInt(901) + 100;
            } else if (difficulty == 4) {
                randInt1 = rand.nextInt(9001) + 1000;
                randInt2 = rand.nextInt(9001) + 1000;
            }
            printQuestion(randInt1, randInt2, cond);
            int ans = getAnswer(scnr);

            if (ans != randInt1 + randInt2) {
                wrongAns();
                wrong = wrong + 1;
            }
            if (ans == randInt1 + randInt2) {
                rightAns();
                right = right + 1;
            }
            counter = counter+1;
        }
        score(right, wrong);

    }
    public static void multiplication(int difficulty, int cond, Scanner scnr){
        SecureRandom rand = new SecureRandom();
        int randInt1=0;
        int randInt2=0;
        int wrong = 0;
        int right = 0;
        int counter = 0;
        while(counter < 10)
        {
            if (difficulty == 1) {
                randInt1 = rand.nextInt(10);
                randInt2 = rand.nextInt(10);
            } else if (difficulty == 2) {
                randInt1 = rand.nextInt(91) + 10;
                randInt2 = rand.nextInt(91) + 10;
            } else if (difficulty == 3) {
                randInt1 = rand.nextInt(901) + 100;
                randInt2 = rand.nextInt(901) + 100;
            } else if (difficulty == 4) {
                randInt1 = rand.nextInt(9001) + 1000;
                randInt2 = rand.nextInt(9001) + 1000;
            }
            printQuestion(randInt1, randInt2, cond);
            int ans = getAnswer(scnr);

            if (ans != randInt1 * randInt2) {
                wrongAns();
                wrong = wrong + 1;
            }
            if (ans == randInt1 * randInt2) {
                rightAns();
                right = right + 1;
            }
            counter = counter+1;
        }
        score(right, wrong);

    }
    public static void subtraction(int difficulty, int cond, Scanner scnr){
        SecureRandom rand = new SecureRandom();
        int randInt1=0;
        int randInt2=0;
        int wrong = 0;
        int right = 0;
        int counter = 0;
        while(counter < 10)
        {
            if (difficulty == 1) {
                randInt1 = rand.nextInt(9)+1;
                randInt2 = rand.nextInt(9)+1;
            } else if (difficulty == 2) {
                randInt1 = rand.nextInt(91) + 10;
                randInt2 = rand.nextInt(91) + 10;
            } else if (difficulty == 3) {
                randInt1 = rand.nextInt(901) + 100;
                randInt2 = rand.nextInt(901) + 100;
            } else if (difficulty == 4) {
                randInt1 = rand.nextInt(9001) + 1000;
                randInt2 = rand.nextInt(9001) + 1000;
            }
            printQuestion(randInt1, randInt2, cond);
            int ans = getAnswer(scnr);

            if (ans != randInt1 - randInt2) {
                wrongAns();
                wrong = wrong + 1;
            }
            if (ans == randInt1 - randInt2) {
                rightAns();
                right = right + 1;
            }
            counter = counter+1;
        }
        score(right, wrong);
    }
    public static void division(int difficulty, int cond, Scanner scnr){
        SecureRandom rand = new SecureRandom();
        double randInt1=0;
        double randInt2=0;
        int wrong = 0;
        int right = 0;
        int counter = 0;
        int numForQ1 =0;
        int numForQ2 =0;
        while(counter < 10)
        {
            if (difficulty == 1) {
                randInt1 = rand.nextInt(9)+1;
                randInt2 = rand.nextInt(9)+1;
            } else if (difficulty == 2) {
                randInt1 = rand.nextInt(91) + 10;
                randInt2 = rand.nextInt(91) + 10;
            } else if (difficulty == 3) {
                randInt1 = rand.nextInt(901) + 100;
                randInt2 = rand.nextInt(901) + 100;
            } else if (difficulty == 4) {
                randInt1 = rand.nextInt(9001) + 1000;
                randInt2 = rand.nextInt(9001) + 1000;
            }
            numForQ1 = (int)randInt1;
            numForQ2 = (int)randInt2;
            printQuestion(numForQ1, numForQ2, cond);
            double ans = getAnsdouble(scnr);
            double solution = randInt1/randInt2;

            if (Math.abs(solution-ans)>0.01) {
                wrongAns();
                wrong = wrong + 1;
            }
            if (Math.abs(solution-ans)<=0.01) {
                rightAns();
                right = right + 1;
            }
            counter = counter+1;
        }
        score(right, wrong);
    }
    public static void random(int difficulty, int cond, Scanner scnr) {
        SecureRandom rand = new SecureRandom();
        int randInt1 = 0;
        int randInt2 = 0;
        int wrong = 0;
        int right = 0;
        int picker = 0;
        int counter = 0;
        while (counter < 10)
        {
            if (difficulty == 1) {
                randInt1 = rand.nextInt(9)+1;
                randInt2 = rand.nextInt(9)+1;
        }   else if (difficulty == 2) {
                randInt1 = rand.nextInt(91) + 10;
                randInt2 = rand.nextInt(91) + 10;
        }   else if (difficulty == 3) {
                randInt1 = rand.nextInt(901) + 100;
                randInt2 = rand.nextInt(901) + 100;
        }   else if (difficulty == 4) {
                randInt1 = rand.nextInt(9001) + 1000;
                randInt2 = rand.nextInt(9001) + 1000;
        }
            picker = rand.nextInt(5) + 1;
        printQuestion(randInt1, randInt2, picker);
        int ans = getAnswer(scnr);

            if (picker == 1) {

                if (ans != randInt1 + randInt2) {
                    wrongAns();
                    wrong = wrong + 1;

                }

                if (ans == randInt1 + randInt2) {
                    rightAns();
                    right = right + 1;
                }
            }
            else if (picker == 2) {
                if (ans != randInt1 * randInt2) {
                    wrongAns();
                    wrong = wrong + 1;
                }
                if (ans == randInt1 * randInt2) {
                    rightAns();
                    right = right + 1;
                }
            }
            else if (picker == 3) {
                if (ans != randInt1 - randInt2) {
                    wrongAns();
                    wrong = wrong + 1;
                }
                if (ans == randInt1 - randInt2) {
                    rightAns();
                    right = right + 1;
                }
            }
            else if (picker == 4) {
                double solution = randInt1/randInt2;
                double dblAns = (double)ans;
                if (Math.abs(solution-dblAns)>0.01) {
                    wrongAns();
                    wrong = wrong + 1;
                }
                if (Math.abs(solution-dblAns)<=0.01) {
                    rightAns();
                    right = right + 1;
                }
            }

        counter = counter + 1;
        }
        score(right, wrong);
    }
    public static void wrongAns(){
        SecureRandom rand = new SecureRandom();
        int randInt = rand.nextInt(4);
        switch(randInt)
        {
            case 0:
                System.out.println("No. Please try again");
                break;
            case 1:
                System.out.println("Wrong. Try once more");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }
    public static void rightAns(){
        SecureRandom rand = new SecureRandom();
        int randInt = rand.nextInt(4);
        switch(randInt)
        {
            case 0:
                System.out.println("Excellent");
                break;
            case 1:
                System.out.println("Very good!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }
    public static int dif(Scanner scnr){
        int input;

        System.out.println("Choose difficulty:");
        System.out.println("1: Single Digits");
        System.out.println("2: Double Digits");
        System.out.println("3: Triple Digits");
        System.out.println("4: Quad Digits");
        input = scnr.nextInt();

        return input;
    }
    public static void score(int rightAns, int wrongAns){
        double score;
        double percent;
        score = (double)rightAns/10.0;
        percent = score * 100;
        if(percent < 75) {
            System.out.println("Please ask your teacher for extra help");
            System.out.printf("You got %d correct and %d incorrect.\n",rightAns, wrongAns);
        }
        else if (percent >= 75) {
            System.out.println("Congrats, you are ready to go on to the next level");
            System.out.printf("You got %d correct and %d incorrect.\n", rightAns, wrongAns);
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int condition = menu(scnr);
        int diff=0;
        if(condition !=6)
            diff = dif(scnr);

        while (condition != 6)
        {
            switch (condition) {
                case 1:
                    addition(diff, condition, scnr);
                    break;
                case 2:
                    multiplication(diff, condition, scnr);
                    break;
                case 3:
                    subtraction(diff, condition, scnr);
                    break;
                case 4:
                    division(diff,condition, scnr);
                    break;
                case 5:
                    random(diff, condition, scnr);
                    break;
            }

       /* while (condition == 1 && counter <10)
        {
            if (diff == 1) {
                randInt1 = rand.nextInt(10);
                randInt2 = rand.nextInt(10);
            }
            else if (diff == 2){
                randInt1 = rand.nextInt(91)+10;
                randInt2 = rand.nextInt(91)+10;
            }
            else if (diff == 3){
                randInt1 = rand.nextInt(901) + 100;
                randInt2 = rand.nextInt(901) + 100;
            }
            else if(diff == 4){
                randInt1 = rand.nextInt(9001)+1000;
                randInt2 = rand.nextInt(9001)+1000;
            }
            printQuestion(randInt1, randInt2, condition);
            int ans = getAnswer(scnr);

            if (ans != randInt1 + randInt2)
            {
                wrongAns();
            }
            if (ans == randInt1 + randInt2)
            {
                rightAns();
                right = right+1;
            }
            counter = counter+1;
        }
        while (condition == 2 && counter <10)
        {
            if (diff == 1) {
                randInt1 = rand.nextInt(10);
                randInt2 = rand.nextInt(10);
            }
            else if (diff == 2){
                randInt1 = rand.nextInt(91)+10;
                randInt2 = rand.nextInt(91)+10;
            }
            else if (diff == 3){
                randInt1 = rand.nextInt(901) + 100;
                randInt2 = rand.nextInt(901) + 100;
            }
            else if(diff == 4){
                randInt1 = rand.nextInt(9001)+1000;
                randInt2 = rand.nextInt(9001)+1000;
            }
            printQuestion(randInt1, randInt2, condition);
            int ans = getAnswer(scnr);

            if (ans != randInt1 * randInt2)
            {
                wrongAns();
            }
            if (ans == randInt1 * randInt2)
            {
                rightAns();
                right = right+1;
            }
            counter = counter+1;
        }
        while (condition == 3 && counter <10)
        {
            if (diff == 1) {
                randInt1 = rand.nextInt(10);
                randInt2 = rand.nextInt(10);
            }
            else if (diff == 2){
                randInt1 = rand.nextInt(91)+10;
                randInt2 = rand.nextInt(91)+10;
            }
            else if (diff == 3){
                randInt1 = rand.nextInt(901) + 100;
                randInt2 = rand.nextInt(901) + 100;
            }
            else if(diff == 4){
                randInt1 = rand.nextInt(9001)+1000;
                randInt2 = rand.nextInt(9001)+1000;
            }
            printQuestion(randInt1, randInt2, condition);
            int ans = getAnswer(scnr);

            if (ans != randInt1 - randInt2)
            {
                wrongAns();
            }
            if (ans == randInt1 - randInt2)
            {
                rightAns();
                right = right+1;
            }
            counter = counter+1;
        }
        while (condition == 4 && counter <10)
        {
            if (diff == 1) {
                randInt1 = rand.nextInt(10);
                randInt2 = rand.nextInt(10);
            }
            else if (diff == 2){
                randInt1 = rand.nextInt(91)+10;
                randInt2 = rand.nextInt(91)+10;
            }
            else if (diff == 3){
                randInt1 = rand.nextInt(901) + 100;
                randInt2 = rand.nextInt(901) + 100;
            }
            else if(diff == 4){
                randInt1 = rand.nextInt(9001)+1000;
                randInt2 = rand.nextInt(9001)+1000;
            }
            printQuestion(randInt1, randInt2, condition);
            int ans = getAnswer(scnr);

            if (ans != randInt1 / randInt2)
            {
                wrongAns();
            }
            if (ans == randInt1 / randInt2)
            {
                rightAns();
                right = right+1;
            }
            counter = counter+1;
        } */

            condition = menu(scnr);
            if(condition != 6) {
                diff = dif(scnr);
            }

        }
    }

}
