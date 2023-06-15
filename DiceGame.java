import java.util.Scanner;
import java.util.Random;
class DiceGame{
    public static void main(String[] args){
        Random dice = new Random();
        int die1 = dice.nextInt(6)+1;
        int die2 = dice.nextInt(6)+1;
        int total = die1 + die2;
        
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("Hello, " + str + "!");

        System.out.println("Rolling dice...");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);
        if(total > 7) System.out.println("You won!");
        else System.out.println("You lost!");
    }
}