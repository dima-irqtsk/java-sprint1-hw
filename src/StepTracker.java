
public class StepTracker {

    int stepTarget = 10000;
    MonthData[] monthArray;

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
    }


    void changeStepTarget (int newStepTarget) { //Метод для смены целевого количества шагов в день
        if (newStepTarget >= 0) {
            stepTarget = newStepTarget;
        } else {
            System.out.println("Цель не может быть отрицательной.");
            System.out.println("Попробуйте снова.");
        }
    }

    void addStepsByDay (int monthNumber, int dayNumber, int stepsValue) {

    }



}