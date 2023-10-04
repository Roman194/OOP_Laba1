import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Инициализация объекта класса сканнер для ввода информации с консоли
        String modifyingString = sc.nextLine(); // Ввод строки из консоли
        modifyingString = modifyingString.replaceAll("[^A-Za-z ]", ""); // удаление всех небувенных символов, кроме пробелов
        System.out.printf(modifyingString); // вывод модифицированной строки в консоль
    }
}