import java.util.ArrayList;

/**
 * Created by IAN on 08/11/14.
 */
public interface DietActions {

    void CountCalories(ArrayList<FoodEaten> foodEaten);
    void AssessNutrition(ArrayList<FoodEaten> foodEaten);

    double AssessRNI();
    double AssessDRI();
    void AssessHealthReport();

}
