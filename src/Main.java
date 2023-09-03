import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();
        int dateAge = (userAge / 2) + 7;
        System.out.println(userAge + "-year olds should date someone who is at least " + dateAge + " years old");
        System.out.println(userAge+"-year olds should read "+(100-userAge)+" pages before giving up on a book");
    }
}