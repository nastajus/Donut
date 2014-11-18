/**
 * Created by IAN on 07/11/14.
 */
public class Tester{
    public static void main(String[] args) throws ClassNotFoundException {

        Protein p = new Protein(4);
        System.out.println(p.milligrams);   //TODO: abstract weights to p.size() or something.

        Magnesium mmm = new Magnesium(420);
        System.out.println(mmm.milligrams);

        //move to Researcher potentially
        Researcher.dvAdd(new Calcium(1100));
        Researcher.dvAdd(new Iron(14));
        Researcher.dvAdd(new Fiber(25));
        Researcher.dvAdd(new Protein(4));

        double grams = Researcher.dvGetGrams(new Calcium(1100));
        System.out.println(grams);

        //donutChocDip
        Donut d = new Donut();
        d.Add(new Carbohydrate(31));
        d.Add(new Protein(4));
        d.Add(new Iron(  Researcher.dvGetGrams( new Iron(10) )));
        d.Add(new Iron(  Researcher.dvGetGrams( new Calcium(2) )));
        d.Add(new Water ( 100 ));

        System.out.println(p.getName());
        for (Nutrient nutrient : d.nutrients){
            System.out.println(nutrient.getName() + " : " + nutrient.milligrams);
        }
        d.Cook();


        d.Grow();



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
