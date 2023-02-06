public class Main {
    public static void main(String[] args) {

        printYearLeap(2020);
        printYearLeap(2022);

        checkDeviseYear(1,2010);
        checkDeviseYear(0,2020);

        checkDeliveryDistance(50);
    }


    public static void printYearLeap(int year) {
        boolean leapYear = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        if (leapYear) {
            System.out.println(year + (" год является високосным."));
        } else {
            System.out.println(year + (" год не является високосным."));
        }
    }


    public static void checkDeviseYear(int clientOs,int clientDeviceYear) {
        int iOs = 0;
        int Android = 1;
        if (clientOs == iOs && (clientDeviceYear <= 2015 || clientDeviceYear > 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }
        }

        if (clientOs == Android && (clientDeviceYear <= 2015 || clientDeviceYear > 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегчённую версию приложения для android по ссылке");

            }
        }
    }

    public static void checkDeliveryDistance(int deliveryDistance) {
        boolean oneDay = (deliveryDistance < 20);
        if (oneDay) {
            System.out.println("Потребуется 1 день");
        } else {
            boolean twoDays = (deliveryDistance > 20) && (deliveryDistance < 60);
            if (twoDays) {
                System.out.println("Потребуется 2 дня");
            } else {
                boolean threedays = (deliveryDistance > 60) && (deliveryDistance < 100);
                if (threedays) {
                    System.out.println("Потребуется 3 дня");
                } else {
                    System.out.println("Доставка не предусмотрена");
                }
            }
        }
    }
}