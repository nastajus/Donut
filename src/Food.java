import java.util.ArrayList;

/**
 * Created by IAN on 09/11/14.
 */
public abstract class Food { // a discrete food item, orderable in a restaurant
    double cost; //optional to logic
    int kcal;
    ArrayList<Nutrient> nutrients = new ArrayList<Nutrient>();


    //some nutritional menus only provide Sugar, others will list Carbs.  All sugars are carbs, but not all carbs are sugar.
    //a feature I want is the ability to add various types of Sugar



}
/*Serving Size
Calories (kcal)
        Total Fat (g)
            Saturated Fat (g)
            Trans Fat (g)
    Cholesterol (mg)
    Sodium (mg)
        Carbohydrate (g)
        Fibre (g)
        Sugars (g)
        Protein (g)
            Vitamin A (% DV)
            Vitamin C (% DV)
            Calcium (% DV)
            Iron (% DV)

    Chocolate Dip 60 g 190 6 2.5 0 0 210 31 1 10 4 0 0 2 10

    //1 gram of protein has 4 cal
    //this donut has 190 kcal ==> 190,000 cal.
    //IN COMMON SPEECH, CALORIE IS USED TO REFER TO KCAL.

    //that donut has 60 g... if that's all fat ==> 540 kcal
    //                       if all carbs      ==> 240 kcal
    // therefore cannot be purely calories. rest must be water.
*/