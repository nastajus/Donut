import java.util.ArrayList;

/**
 * Created by IAN on 08/11/14.
 */
public interface DietActions {

    //imagine i'm a doctor, wanting to asses your fitness. there should be a way to count calories.
    //imagine i'm scientist or somebody whose researched or has accessed all the optimum values


    void CountCalories(ArrayList<Food> foods);
    void AssessNutrition(ArrayList<Food> foods);

    double AssessRNI();     //return a percentage only between 0-100 of each requirement. amounts exceeding not counted.
    double AssessDRI();
    void AssessHealthReport(); // smartest logic goes here.
    // a manner to acknowledge supreme health.. basically would have to consider excess amounts of vitamins ok somehow.


//    - DRI - Dietary Researcher Intakes - since 1997
//    - RNI - Recommended Nutrient Intakes - older      (RDA)

}
