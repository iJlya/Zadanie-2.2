
public class Main {
    public static void main(String[] args) {
        int score = 100; // начальный счет
        int replenishment = 1100; // сумма пополнения

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int total = score + replenishment + bonus;

        System.out.println("Итого:" + total );
        System.out.println("Бонус:" + bonus);

    }
}