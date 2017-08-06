import java.util.Scanner;
public class TripPlaner {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name1 = input.nextLine();
        System.out.println("Nice to meet you " + name1 + ", where are you travelling to?");
        String name2 = input.nextLine();
        System.out.println("Great! Mexico City sounds like a great trip");
    }
}
