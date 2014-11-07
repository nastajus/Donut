/**
 * Created by IAN on 07/11/14.
 */


public class Protein extends Nutrient {

    //QUESTION: does there exists a "contractual way" or automatic way to force an inheriting class to have the
    //          constructor already that a parent has?
    //ANSWER:   it was a terrible idea
    //          http://stackoverflow.com/questions/1644317/java-constructor-inheritance
    public Protein (int grams){
        super(grams);
    }
}
