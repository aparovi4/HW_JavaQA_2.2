public class Main {
    public static <i, o> void main(String[] args) {
        int balance = 100;
        int deposit = 1100;
        int bonus;
        if (deposit <= 1000) {
            bonus = 0;
        } else {
            bonus = deposit / 100;
        }
        int o = balance + deposit + bonus;
        System.out.println("Счет - " + (o)+ ", начисленно бонусов - " + (bonus));
    }
}