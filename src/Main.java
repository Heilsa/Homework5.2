public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total += salary;
            total = total + salary;
            System.out.println("Месяц " + (month++) + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number++);
        }
        System.out.println(" С помощью while");
        for (number = 10; number >= 1; number--) {
            System.out.print(number);
        }
        System.out.println(" С помощью for");
        System.out.println("Задача 3");
        int Y = 12_000_000;
        int spawn = 17;
        int dead = 8;
        int year = 1;
        int on = 1000;
        while (year <= 10) {
            Y = (spawn - dead) * on + Y;
            System.out.println("Год " + year + ", численность населения составляет " + Y);
            year++;
        }
        System.out.println("Задача 4");
        int contribution = 15000;
        int all = 12000000;
        int totalAmount = 0;
        int months = 0;
        while (totalAmount < all) {
            totalAmount = totalAmount + contribution + (contribution / 100 * 7);
            totalAmount += contribution;
            System.out.println("Василий в этом " + (months++) + " месяце накопит такое " + totalAmount + " количество денег");
        }

        System.out.println("Задача 5");
        int zp = 20000;
        int nuzno = 1000000;
        int vBanke = 0;
        int mesyac = 0;
        while (vBanke < nuzno) {
            mesyac++;
            vBanke += zp;
            if (mesyac % 6 == 0) {
                System.out.println("Месяц " + mesyac + ", сумма накоплений равна " + vBanke + " рублей");
            }
        }
        System.out.println("Задача 6");
        int zarplata = 15000;
        int nakoplenie = 0;
        int eachHalfYear = 0;
        int goda = 9;
        while (eachHalfYear < goda) {
            eachHalfYear++;
            nakoplenie = zarplata + (zarplata / 100 * 7);
            nakoplenie += zarplata;
            if (eachHalfYear % 7 == 0) {
                System.out.println("Месяц " + eachHalfYear + ", сумма накоплений равна " + nakoplenie + " рублей");
            }
        }
        System.out.println("Задача 7");
        int friday = 7;
        int eachMonth = 31;
        for (int week = 7; week <= eachMonth; week = week + 7) {
            System.out.println("Сегодня пятница, " + week + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача 8");
        int cometPeriod = 79;
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        System.out.println("Годы появления кометы за последние 200 лет:");
        for (int yearr = startYear; yearr <= currentYear; yearr++) {
            if (yearr % cometPeriod == 0) {
                System.out.println(yearr);
                int nextCometYear = (currentYear / cometPeriod + 1) * cometPeriod;
                if (nextCometYear <= endYear) {
                    System.out.println("Следующий год появления кометы: " + nextCometYear);
                }
            }
        }
    }
}


