public class Main {
    public static void main(String[] args) {
        int account = 300;
        int topup = 1500;
        int bonus;
        if (topup > 1000) {
            bonus = topup / 100;
        }

        else {
            bonus = 0;
        }

        System.out.println("Итоговый счет:");
        System.out.println(account + topup + bonus);
        System.out.println("Количество бонусных рублей:");
        System.out.println(bonus);



    }
}