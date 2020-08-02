public class Bonus {
    public static void main(String[] args) {
        boolean payment = true;
        int amount = 1300;
        int result = 100;
        long bonus = amount / 100;
        long limit = 1000;
        if (amount < limit) {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}