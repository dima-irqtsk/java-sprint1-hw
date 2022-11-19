import java.util.Scanner;

public class Main {

    static StepTracker stepTracker;

    public static void main(String[] args) {

        stepTracker = new StepTracker();

        Scanner scanner = new Scanner(System.in);
        printMainMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            if (userInput == 1) { // 1. Ввод количества шагов
                readMonthDaySteps();
            } else if (userInput == 2) { // 2. Статистика за месяц
                System.out.println("Статистика"); // Заглушка
            } else if (userInput == 3) { // 3. Изменить цель
                System.out.println("Новая цель"); // Заглушка
            } else  { // Пользователь ввел цифру, отличную от 0, 1, 2 или 3
                System.out.println("Выберите действие снова");
            }


            printMainMenu();
            userInput = scanner.nextInt();
        }
        System.out.println("Работа завершена");
    }

    public static void printMainMenu() {
        System.out.println("ГЛАВНОЕ МЕНЮ:");
        System.out.println("Выберите действие");
        System.out.println("1. Ввести количество шагов за день");
        System.out.println("2. Показать статистику за месяц");
        System.out.println("3. Изменить цель по количеству шагов в день");
        System.out.println("0. Выйти из приложения");
    }

    public static void readMonthDaySteps() {

        System.out.println("Введите порядковый номер месяца");
        Scanner scanner;
        scanner = new Scanner(System.in);
        int monthNumber = scanner.nextInt() -  1; //Уменьшаем значение переменной на единицу, чтоб обращаться к нужному элементу массива
        while (monthNumber < 0 | monthNumber > 11) { //Проверяем на соответствие диапазону
            System.out.println("Введено неправильное значение.");
            System.out.println("Номер месяца должен быть в диапазоне от 1 до 12,");
            System.out.println("попробуйте еще раз.");
            System.out.println("Введите порядковый номер месяца"); //мучаем пользователя, пока не введет правильно
            monthNumber = scanner.nextInt() -  1;
        }

        System.out.println("Введите порядковый номер дня");
        int dayNumber = scanner.nextInt() -  1; //Уменьшаем значение переменной на единицу, чтоб обращаться к нужному элементу массива
        while (dayNumber < 0 | dayNumber > 29) { //Проверяем на соответствие диапазону
            System.out.println("Введено неправильное значение.");
            System.out.println("Номер дня должен быть в диапазоне от 1 до 30,");
            System.out.println("попробуйте еще раз.");
            System.out.println("Введите порядковый номер дня"); //мучаем пользователя, пока не введет правильно
            dayNumber = scanner.nextInt() -  1;
        }

        System.out.println("Введите число шагов");
        int stepsValue = scanner.nextInt();
        while (stepsValue < 0) { //Проверяем, не является ли значение отрицательным
            System.out.println("Введено неправильное значение.");
            System.out.println("Число шагов не может быть меньше нуля,");
            System.out.println("попробуйте еще раз.");
            System.out.println("Введите число шагов"); //мучаем пользователя, пока не введет правильно
            stepsValue = scanner.nextInt();
        }

        stepTracker.addStepsByDay(monthNumber, dayNumber, stepsValue);

    }

}
