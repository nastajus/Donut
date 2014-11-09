import java.util.ArrayList;

/**
 * Created by IAN on 09/11/14.
 */
public final class Doctor implements DietActions {

    private Doctor(){};     //final class + private constructor in Java ~== static class C#

    @Override
    public void CountCalories(ArrayList<FoodEaten> foodEaten) {

    }

    @Override
    public void AssessNutrition(ArrayList<FoodEaten> foodEaten) {

    }

    @Override
    public double AssessRNI() {
        return 0;
    }

    @Override
    public double AssessDRI() {
        return 0;
    }

    @Override
    public void AssessHealthReport() {

    }
}
