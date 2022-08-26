public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static int leapYear() {
        return 2024;
    }

    public static void task1() {
        int year = leapYear();
        if (year % 4 == 0) {
            System.out.println(year + " это високосный год");
        } else if ((year % 4 == 0) && (year % 100 == 0)) {
            System.out.println(year + (" это високосный год"));
        } else {
            System.out.println(year + " это не високосный год");
        }
    }

    public static int ClientOS(String name) {
        if (name.equals("IOS")) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int deviceYear() {
        return 2016;
        }


    public static void task2() {
            String osName = "IOS";
            int clientOS = ClientOS(osName);
            int clientDeviceYear = deviceYear();
        if (clientOS == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Приложение подходит для данной версии телефона IOS");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear > 2015) {
                System.out.println("Приложение подходит для данной версии телефона Android");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static int diliveryDistance(int deliveryDays) {
        int deliverydistance = 95;
        if (deliverydistance > 20) {
            deliveryDays++;
        }
        if (deliverydistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);
        return deliverydistance;
    }

    public static void task3() {
        int deliveryDays = 1;
        diliveryDistance(deliveryDays);

    }
}