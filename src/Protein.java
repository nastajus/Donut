/**
 * Created by IAN on 07/11/14.
 */


public class Protein extends Nutrient {

    //QUESTION: does there exists a "contractual way" or automatic way to force an inheriting class to have the
    //          constructor already that a parent has?
    public Protein (int grams){
        super(grams);
    }
}
