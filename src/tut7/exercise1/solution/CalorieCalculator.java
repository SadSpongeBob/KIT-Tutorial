package tut7.exercise1.solution;

final class CalorieCalculator {
    private CalorieCalculator() { }

    public static int calorieCalculator(Edible[] edibles) {
        int calories = 0;
        for (Edible edible : edibles) {
            calories += edible.getCalories();
        }
        return calories;
    }
}
