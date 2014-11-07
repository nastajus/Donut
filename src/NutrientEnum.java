/**
 * Created by IAN on 07/11/14.
 */
public enum NutrientEnum {

    //ENUM_NAME { __________________ {     ANONYMOUS CLASS   }  ;
    PROTEIN{  Protein protein(grams) { return protein(grams);} };    //unknown class grams
                                                                     //anonymous class derived from cannot be applied to (int)
    int grams;

    //trying to find a way to initialize the grams in protein now
    NutrientEnum(int grams){
        this.grams = grams;
    }

    int get(){ return this.grams; }

}
