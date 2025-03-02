public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 1;
        while (total < 2_459_000) {
            total += salary;
            System.out.println("Месяц " + (month++) + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        System.out.println("Задача 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number++ + " ");
        }
        System.out.println();
        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        int Y = 12000000;
        int spawn = 17;
        int dead = 8;
        int currentYear = 2025;
        for (int year = currentYear; year < currentYear + 10; year++) {
            Y = (spawn - dead) * 1000 + Y;
            System.out.println("Год " + year + ", численность населения составляет " + Y);
        }
        System.out.println();
        System.out.println("Задача 4");
        int contribution = 15000;
        int all = 12_000_000;
        int totalAmount = contribution;
        int months = 0;
        while (totalAmount < all) {
            totalAmount = totalAmount + contribution + (contribution * 7) / 100;
            System.out.println("Василий в этом " + (months++) + " месяце накопит такое " + totalAmount + " количество денег");
        }
        System.out.println("Задача 5");
        int zp = 20000;
        int nuzno = 1000000;
        int vBanke = 0;
        int mesyac = 0;
        while (vBanke < nuzno) {
            mesyac++;
            vBanke += zp + (zp * 7 / 100);
            if (mesyac % 6 == 0) {
                System.out.println("Месяц " + mesyac + ", сумма накоплений равна " + vBanke + " рублей");
            }
        }
        System.out.println("Задача 6");
        salary = 15000;
        int monthlyInterestRate = 7;
        int totalMonths = 9 * 12;
        int monthsToCheck = 6;
        int totalSavings = salary * 100;
        System.out.println("Начальная сумма рублей в копейках: " + salary);
        for (int mon = 1; mon <= totalMonths; mon++) {
            totalSavings += totalSavings * monthlyInterestRate / 100;
            if (mon % monthsToCheck == 0) {
                System.out.println("Месяц " + mon + ", сумма накоплений равна " + totalSavings + " рублей");
            }
        }
        System.out.println("Задача 7");
        int firstFriday = 7;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Задача 8");
        int period = 79;
        int startSee = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSee; year < end; year += period) {
            if (year > start)
                System.out.println(year);
        }
    }
}



