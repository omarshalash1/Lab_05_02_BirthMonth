import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your birth month (1-12): ");
    int birthMonth = 15;

    if (birthMonth >= 1 && birthMonth <= 12) {
      System.out.println("Your birth month is: " + birthMonth);
    } else {
      System.out.println("You entered an incorrect month value: " + birthMonth);
    }
  }
}
