/**
 * Created by IAN on 07/11/14.
 */
public class Tester {
    public static void main(String[] args){

        Protein p = new Protein(2);
        System.out.println(p.milligrams);   //--> p.grams();        //use a method here.

        // i want to override this data so it only returns integers in the case of Organics but not Minerals.
        // can do via a method
        // i could make milligrams in Nutrient private.

        Magnesium mmm = new Magnesium(420);
        System.out.println(mmm.milligrams); //--> p.milligrams;     //leave as is

    }
}
