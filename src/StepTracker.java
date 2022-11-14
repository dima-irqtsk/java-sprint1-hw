
public class StepTracker {

    int stepTarget = 10000;
    static MonthData[] monthArray;

    public StepTracker() {
        monthArray = new MonthData[12];
        for (int i = 0; i < monthArray.length; i++) {
            monthArray[i] = new MonthData();
        }
    }

    public static class MonthData {
        // Заполните класс самостоятельно
        int[] dayData;

        {
            dayData = new int[30];
            for (int j = 0; j < dayData.length; j++) {
                dayData[j] = 0;
            }
        }

        public void addStepsByDay(int monthNumber, int dayNumber, int stepsValue) {
            monthArray[monthNumber].dayData[dayNumber] = stepsValue;
        }
    }


    void changeStepTarget (int newStepTarget) { //Метод для смены целевого количества шагов в день
        if (newStepTarget >= 0) {
            stepTarget = newStepTarget;
        } else {
            System.out.println("Цель не может быть отрицательной.");
            System.out.println("Попробуйте снова.");
        }
    }
}