import java.util.HashMap;
import java.util.Map;

/**
 * Created by IAN on 09/11/14.
 */
public final class Researcher {

    private Researcher(){}

    static Map<String, Double> dailyValues = new HashMap<String, Double>();

    //i tried exploring using NutrientEnum as a more restrictive way to limit input, but i abandoned.
    static void dvAdd(Nutrient nutrient){
        String key = nutrient.getClass().getSimpleName();
        Double value = nutrient.milligrams;
        dailyValues.put(key,value);
    }


    public boolean BuildRNI() {
        return false;
    }

    public boolean BuildDRI() {
        return false;
    }

    //converts daily value of input compareNutrient vs. stored list of daily values
    public static double dvGetGrams(Nutrient compareNutrient) { //for DV //i'm conflicted between concise name vs. naming w/ DV.
        String DVnutrient = compareNutrient.getClass().getSimpleName();
        double graams = dailyValues.get(DVnutrient) / 100 * compareNutrient.milligrams;
        return graams;
    }

}
