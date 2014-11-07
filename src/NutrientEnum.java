/**
 * Created by IAN on 07/11/14.
 */
public enum NutrientEnum {

    //I made this syntax, slightly altering an example to my understanding.
    PROTEIN{  Protein protein() { return protein();} };
    //is this a callback?
    //what do i call the process occurring on that line?
    //what's happening in both nested braces?

    int grams;
    int get(){ return grams; }

}
