public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int savings = 0;
        int monthlyDeposit = 15000;
        int targetAmount = 2459000;
        int months = 0;
        while (savings < targetAmount) {
            savings += monthlyDeposit;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println();

        // Задача 2
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }

        System.out.println("\n");

        // Задача 3
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        for (int year = 1; year <= 10; year++) {
            population += (population / 1000) * (birthRate - deathRate);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }

        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        double deposit = 15000;
        int target = 12000000;
        months = 0;
        while (deposit < target) {
            deposit *= 1.07;
            months++;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + (int) deposit + " рублей");
        }

        System.out.println();

        // Задача 5
        System.out.println("Задача 5");
        deposit = 15000;
        months = 0;
        while (deposit < target) {
            deposit *= 1.07;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + (int) deposit + " рублей");
            }
        }

        System.out.println();

        // Задача 6
        System.out.println("Задача 6");
        deposit = 15000;
        for (int halfYear = 6; halfYear <= 9 * 12; halfYear += 6) {
            for (int j = 0; j < 6; j++) {
                deposit *= 1.07;
            }
            System.out.println("Через " + halfYear + " месяцев сумма накоплений: " + (int) deposit + " рублей");
        }

        System.out.println();

        // Задача 7
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        System.out.println();

        // Задача 8
        System.out.println("Задача 8");
        int currentYear = 2024;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}
