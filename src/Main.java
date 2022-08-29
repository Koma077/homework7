import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    private static void leapYear(int year) {
        if ((year % 400 == 0) || ((year % 100 != 0 & (year % 4 == 0)))){
            System.out.println(year + " - високосный год");
        }else{
            System.out.println(year + " - не високосный год");
        }
    }

    public static void task1() {
        leapYear(2024);


    }

    public static void deviceClient(int os, int deviceYear) {
        int currentYear = 2015;

        String versionMessage = deviceYear < currentYear ? "облегченную" : "";
        String osMessage = os == 0 ? "IOS" : "Android";

        System.out.printf("Установите %s версию приложения для %s по ссылке", versionMessage, osMessage);
        System.out.println();
    }



    public static void task2() {
        deviceClient(0, 2016);
    }

    public static int diliveryDistance(int distance) {
        int deliveryDays = 1;
        int firstDistance = 20;
        int nextDistance = 60;
        if (distance > firstDistance) {
            deliveryDays++;
        }
        if (distance > nextDistance) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней " + deliveryDays);
        return distance;
    }

    public static void task3() {
        diliveryDistance(95);

    }
}