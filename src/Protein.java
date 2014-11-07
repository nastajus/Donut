/**
 * Created by IAN on 07/11/14.
 */
// extends NutrientEnum fails
// because "cannot inherit from final NutrientEnum"
// i'm wondering if that pertains to a comment of multiple inheritance not being allowed for Enums...
// which doesn't exactly make sense to me.

public class Protein {
    int grams;
    Protein(int grams){
        this.grams = grams;
        System.out.println ("Created"); //doesn't execute
    }
}
