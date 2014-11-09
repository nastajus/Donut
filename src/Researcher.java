import java.util.ArrayList;
import java.util.List;

/**
 * Created by IAN on 09/11/14.
 */
public final class Researcher {

    private Researcher(){}

    static List<Nutrient> dailyValues = new ArrayList<Nutrient>();
    //http://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist




    public boolean BuildRNI() {
        return false;
    }

    public boolean BuildDRI() {
        return false;
    }

    //converts daily value of input compareNutrient vs. stored list of daily values
    public static double getGrams(Nutrient compareNutrient) throws ClassNotFoundException { //for DV //i'm conflicted between concise name vs. naming w/ DV.

        String s = compareNutrient.getClass().getSimpleName();
        try {
            Nutrient n = (Nutrient)Class.forName(s).newInstance();
            if ( dailyValues.contains(n) ){
                int i = dailyValues.indexOf(n);
                double value = dailyValues.get(i).milligrams;
                return value / 100 * compareNutrient.milligrams;
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }


}
