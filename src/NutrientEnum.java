/**
 * Created by IAN on 07/11/14.
 */
public enum NutrientEnum {

    PROTEIN{  Protein protein(grams) { return protein();} };    //unknown class grams

    //trying to find a way to initialize the grams in protein now
    NutrientEnum(int grams){
        this.grams = grams;
    }

    int grams;
    int get(){ return this.grams; }

}
