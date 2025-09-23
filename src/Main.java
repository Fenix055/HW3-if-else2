import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /// Task 1
        int clientOS = new Random().nextInt(2);

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        /// Task 2
        short clientDeviceYear = 2015;

        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS != 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        /// Task 3
        int year = new Random().nextInt(2147483640 - 1584 + 1) + 1584;

        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        /// Task 4
        short deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("доставки нет");
        } else if (deliveryDistance <= 100 && deliveryDistance > 60) {
            System.out.println("Потребуется дней:" + 3);
        } else if (deliveryDistance <= 60 && deliveryDistance > 20) {
            System.out.println("Потребуется дней:" + 2);
        } else {
            System.out.println("Потребуется дней:" + 1);
        }

        /// Task 5
        byte monthNumber = 12;

        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
            }
        }
    }
}