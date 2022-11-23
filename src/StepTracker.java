public class StepTracker {

    MonthData[] monthArray;
    static int stepTarget = 10000;

    public StepTracker() {
        monthArray = new MonthData[12];
        for (int i = 0; i < monthArray.length; i++) {
            monthArray[i] = new MonthData();
        }
    }

    class MonthData {
        // Заполните класс самостоятельно
        int[] dayArray;

        MonthData() {
            dayArray = new int[30];
        }
    }

    void addStepsByDay(int month, int day, int steps) { // Метод внесения количества шагов в память приложения
        monthArray[month].dayArray[day] = steps;
    }

    public void changeStepTarget(int newStepTarget) { // Метод изменения целевого количества шагов
        stepTarget = newStepTarget;
    }

    public void calculateStatistics(int monthStat) {

        // вывод числа шагов по дням

        for (int i = 0; i < monthArray[monthStat].dayArray.length; i++) {
            if (i < monthArray[monthStat].dayArray.length - 1) {
                System.out.print(i + 1 + " день: " + monthArray[monthStat].dayArray[i] + ", ");
            } else {
                System.out.println(i + 1 + " день: " + monthArray[monthStat].dayArray[i]);
            }
        }


        // вывод общего числа шагов за месяц

        int stepSum = 0;
        for (int i = 0; i < monthArray[monthStat].dayArray.length; i++) {
            stepSum = stepSum + monthArray[monthStat].dayArray[i];
        }
        System.out.println("Всего за этот месяц пройдено " + stepSum + " шагов.");

        // вывод максимального числа шагов в день за выбранный месяц

        int maxSteps = 0;
        for (int i = 0; i < monthArray[monthStat].dayArray.length; i++) {
            if (maxSteps < monthArray[monthStat].dayArray[i]) {
                maxSteps = monthArray[monthStat].dayArray[i];
            }
        }
        System.out.println("Самое большое число шагов в день — " + maxSteps + ".");


        // вывод среднего количества шагов в день

        int averageSteps = stepSum / monthArray[monthStat].dayArray.length;
        System.out.println("Среднее число шагов в день — " + averageSteps);


        // вывод пройденной дистанции в километрах
        System.out.println("Всего за месяц пройдено " + Converter.convertStepsToDistance(stepSum) + " километров");

        // вывод сожженных килокалорий
        System.out.println("и сожжено  " + Converter.convertStepsToCalories(stepSum) + " килокалорий.");


        // расчет и вывод лучшей серии

        int goalReachedCounter = 0; // счетчик серии дней
        int bestSeries = 0; // переменная для хранения длины лучшей серии дней
        for (int i = 0; i < monthArray[monthStat].dayArray.length; i++) {
            if (monthArray[monthStat].dayArray[i] >= stepTarget) {
                goalReachedCounter++;
                if (bestSeries < goalReachedCounter) {
                    bestSeries = goalReachedCounter;
                }
            } else {
                goalReachedCounter = 0;
            }
        }
        System.out.println("Ваше упорство заслуживает уважения! Вы целых "+bestSeries +" дней превышали свою цель по числу шагов.");
    }
}