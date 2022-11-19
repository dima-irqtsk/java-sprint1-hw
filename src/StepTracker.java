public class StepTracker {

    static MonthData[] monthToData;

    public StepTracker() {
        MonthData[] monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    class MonthData {
        // Заполните класс самостоятельно
        int[]  dayToData;

        public MonthData() {
            dayToData = new int[30];
        }
    }

     public static void addStepsByDay(int month, int day, int steps)  {
        monthToData[month].dayToData[day] = steps;
    }
}