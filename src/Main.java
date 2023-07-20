// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int account = 1000;
        int amount = 2000;
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total = account + amount + bonus;
        System.out.println("Бонус:" + bonus);
        System.out.println("Итоговая сумма на счету клиента: " + total);
    }
}