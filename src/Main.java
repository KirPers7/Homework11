import java.time.LocalDate;

public class Main {

    public static void determineLeapYear(int year) {

        short yearCount = (short) ((year - 1584) % 4);
        short leapYearExclude = (short) ((year - 1584) % 100);
        short leapYearInclude = (short) ((year - 1584) % 400);

        if (leapYearInclude == 0 && year >= 1584) {
            System.out.println(year + " год - високосный год");
        } else if (leapYearExclude == 0 && year >= 1584) {
            System.out.println(year + " год - не високосный год");
        } else if (yearCount == 0 && year >= 1584) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static void determineOS(byte clientOS, short clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int countDeliveryDays(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        }
        return deliveryDistance;
    }

    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        int checkYear = 2021;

        determineLeapYear(checkYear);

        System.out.println();

        //Задание 2
        System.out.println("Задание 2");

        byte choiceOS = 1;
        short choiceYear = 2024;

        determineOS(choiceOS, choiceYear);

        System.out.println();

        //Задание 3
        System.out.println("Задание 3");

        int distance = 28;
        int days = countDeliveryDays(distance);

        if (days <= 3) {
            switch (days) {
                case 1, 2, 3 -> System.out.println("Потребуется дней: " + days);
            }
        } else {
            System.out.println("Доставки нет");
        }
    }
}