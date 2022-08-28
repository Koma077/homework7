import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static boolean leapYear(int year) {
        if ((year % 400 == 0) || ((year % 100 != 0 & (year % 4 == 0)))){
            System.out.println(year + " - високосный год");
        }else{
            System.out.println(year + " - не високосный год");
        }
        return true;
    }

    public static void task1() {
        int year = 2024;
        leapYear(year);


    }

    public static void deviceClient(int OS, int deviceYear) {
        int currentYear = 2015;

        String versionMessage = deviceYear < currentYear ? "облегченную" : "";
        String osMessage = OS == 0 ? "IOS" : "Android";

        System.out.printf("Установите %s версию приложения для %s по ссылке", versionMessage, osMessage);
        System.out.println();
    }



    public static void task2() {
        deviceClient(0, 2016);
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