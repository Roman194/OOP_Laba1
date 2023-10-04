import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String modifyingString = sc.nextLine();
        modifyingString = modifyingString.replaceAll("[^A-Za-z ]", "");
        System.out.printf(modifyingString);
    }
}