import java.security.cert.CertPathValidatorException;

/**
 * Created by IAN on 07/11/14.
 */
public class Tester {
    public static void main(String[] args){

        Protein p = new Protein(4);
        System.out.println(p.milligrams);   //TODO: abstract weights to p.size() or something.

        Magnesium mmm = new Magnesium(420);
        System.out.println(mmm.milligrams);

        //move to Researcher potentially
        Researcher.dailyValues.add(new Calcium(1100));
        Researcher.dailyValues.add(new Iron(14));
        Researcher.dailyValues.add(new Fiber(25));
        Researcher.dailyValues.add(new Protein(4));

        //donutChocDip
        Donut d = new Donut();
        double grams = Researcher.getGrams(new Calcium(2)); 
        //d.nutrients.add(new Calcium( ))
        d.nutrients.add(p);



        /*Serving Size
Calories (kcal)
        Total Fat (g)
            Saturated Fat (g)
            Trans Fat (g)
    Cholesterol (mg)
    Sodium (mg)
        Carbohydrate (g)
        Fibre (g)
        Sugars (g)
        Protein (g)
            Vitamin A (% DV)
            Vitamin C (% DV)
            Calcium (% DV)
            Iron (% DV)

    Chocolate Dip 60 g 190 6 2.5 0 0 210 31 1 10 4 0 0 2 10

*/


    }
}
