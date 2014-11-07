/**
 * Created by IAN on 07/11/14.
 */
public enum NutrientEnum {
    PROTEIN{ public Protein getProtein() { return new Protein(); }}; //use temporarily to test
    int grams;
    NutrientEnum getNutrient() { return this; }

}
