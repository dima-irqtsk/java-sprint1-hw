public class Converter {
    static double stepRate = 0.75/1000;
    static double calRate = 50.0/1000;

    public static double convertStepsToDistance(int stepSum) {
        return stepSum * stepRate;
    }

    public static double convertStepsToCalories(int stepSum) {
        return stepSum * calRate;
    }



}
