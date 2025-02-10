public class Main {
    public static void main(String[] args) {
        // Задача 1
            System.out.println("** Задача 1 **");
        byte varByte = 123;
            System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        short varShort = 30111;
            System.out.println("Значение переменной varShort с типом short равно " + varShort);
        int varInt = 1000000000;
            System.out.println("Значение переменной varInt с типом int равно " + varInt);
        long varLongo = 1235465465;
            System.out.println("Значение переменной varLongo с типом long равно " + varLongo);
        float varFloat = 175.333f;
            System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        double varDouble = 0.231847686786987;
            System.out.println("Значение переменной varDouble с типом double равно " + varDouble);

        // Задача 2
            System.out.println();
            System.out.println("** Задача 2 **");
        byte c = 67;
            System.out.println(c);
        short e = 569;
            System.out.println(e);
        short f = -159;
            System.out.println(f);
        int g = 27897;
            System.out.println(g);
        float b = 987678965549F;
            System.out.println(b);
        float a = 27.12F;
            System.out.println(a);
        double d = 2.786F;
            System.out.println(d);

        // Задача 3
        // Три школьных учителя, Людмила Павловна (firstClass), Анна Сергеевна (secondClass) и Екатерина Андреевна       	// (thirdClass), ведут три класса.
        // У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        // Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется 	 	// листов каждому ученику.
        // Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
            System.out.println();
            System.out.println("** Задача 3 **");
        short firstClass = 23;
        short secondClass = 27;
        short thirdClass = 30;
            System.out.println("На каждого ученика рассчитано " + (480 / (firstClass + secondClass + thirdClass))  + " листов бумаги");

        // Задача 4
        //
        // Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты
        //
            System.out.println();
            System.out.println("** Задача 4 **");
        byte outputPm = 16 / 2; // производительность машины/мин.
        short HourMinute = 60; // количество минут в 1 часе
        int dayTime = 24 * HourMinute; // количество минут в сутках
        int threeDays = dayTime * 3;  // количество минут в 3 сутках
        int monthTime = dayTime * 30; // количество минут в 1 месяце, если месяц = 30 дней
            System.out.println("За 20 минут машина произвела " + (20 * outputPm) + " штук бутылок");
            System.out.println("За 1 день машина произвела " + (dayTime * outputPm) + " штук бутылок");
            System.out.println("За 3 дня машина произвела " + (threeDays * outputPm) + " штук бутылок");
            System.out.println("За 30 дней машина произвела " + (monthTime * outputPm) + " штук бутылок");

        // Задача 5
        // Красим классы в школе
        // На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 	// 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        // Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок 	// коричневой краски».

            System.out.println();
            System.out.println("** Задача 5 **");
        byte paintCans = 120;
        byte classCans = 2 + 4;
        int classesQuantity = paintCans / classCans;
        int whiteCans = classesQuantity * 2;
        int brownCans = classesQuantity * 4;
            System.out.println("В школе " + classesQuantity + " классов, для их покраски нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски");

        // Задача 6
        // Расчет полного веса завтрака спортсмена
            System.out.println();
            System.out.println("** Задача 6 **");
        short weightBanana = 80;
        short weightMilk = 105;
        short weightIcecream = 100;
        short weightEgg = 80;
        float weightBreakfast = (5 * weightBanana + 2 * weightMilk + 2 * weightIcecream + 4 * weightEgg);
            System.out.println("После смешивания в блендере 5 штук бананов, 200 мл молока, 2-х брикетов мороженого и 4-х яиц общий вес завтрака составил " + weightBreakfast + " граммов" + " что равно " + (weightBreakfast / 1000) + " кг");


        // Задача 7
            System.out.println();
            System.out.println("** Задача 7 **");
        float weightLoss = 7;
        float dayWeightloss1 = 0.25F;
        float dayWeightloss2 = 0.5F;
        int daysCount1 = (int) (weightLoss / dayWeightloss1);
            System.out.println("Если спортсмен будет худеть на 250г в день, то на это уйдет " + daysCount1 + " дней");
        int daysCount2 = (int) (weightLoss / dayWeightloss2);
            System.out.println("Если спортсмен будет худеть на 500г в день, то на это уйдет " + daysCount2 + " дней");
            System.out.println("В среднем на похудение понадобится " + ((daysCount1 + daysCount2) / 2) + " дней");

        // Задача 8
        // Маша получает 67 760 рублей в месяц.
        // Денис получает 83 690 рублей в месяц.
        // Кристина получает 76 230 рублей в месяц.
        // Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать 	// разницу между годовым доходом с нынешней зарплатой и после повышения.
            System.out.println();
            System.out.println("** Задача 8 **");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristine = 76230;
        float salaryMashadiff = (float) (salaryMasha * 0.1);
        int salaryMashanew = (int) (salaryMasha + salaryMashadiff);
            System.out.println("Маша теперь получает " + salaryMashanew + " рублей. Годовой доход вырос на " + ((salaryMashanew - salaryMasha) * 12) + " рублей");
        float salaryDenisdiff = (float) (salaryDenis * 0.1);
        int salaryDenisnew = (int) (salaryDenis + salaryDenisdiff);
            System.out.println("Денис теперь получает " + salaryDenisnew + " рублей. Годовой доход вырос на " + ((salaryDenisnew - salaryDenis) * 12) + " рублей");
        float salaryChristinediff = (float) (salaryChristine * 0.1);
        int salaryChristinew = (int) (salaryChristine + salaryChristinediff);
            System.out.println("Кристина теперь получает " + salaryChristinew + " рублей. Годовой доход вырос на " + ((salaryChristinew - salaryChristine) * 12) + " рублей");

    }
}