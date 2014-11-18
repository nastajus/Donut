import java.util.ArrayList;

/**
 * Created by IAN on 09/11/14.
 */
public abstract class Food implements Cookable, Growable { // a discrete food item, orderable in a restaurant
    double cost; //optional to logic
    int kcal;
    double weight;
    ArrayList<Nutrient> nutrients = new ArrayList<Nutrient>();

    boolean isCooked = false;
    boolean isGrown = false;


    Food(){}

    Food(int kcal){
        if (kcal < 0){
            throw new IllegalStateException("Negative Calories not permitted");
        }
        else {
            this.kcal = kcal;
        }
    }


    void Add(Nutrient nutrient){
        if ( !nutrients.contains(nutrient) ){
            nutrients.add(nutrient);
        }
    }
    //some nutritional menus only provide Sugar, others will list Carbs.  All sugars are carbs, but not all carbs are sugar.
    //a feature I want is the ability to add various types of Sugar

    @Override
    public void Cook(){
        if (!isCooked){
            isCooked = true;
            for(Nutrient nutrient : nutrients){
                System.out.print( nutrient.getName() + ":" + nutrient.milligrams );
                nutrient.Cook();
                System.out.println( ":" + nutrient.milligrams );
            }
        }
    }

    @Override
    public void Grow() {
        if (!isGrown){
            isGrown = true;
            boolean found = false;
            for( Nutrient nutrient : nutrients ){
                System.out.println ("looking at : " +  nutrient.getName() );
                if (nutrient.getName().equals( new Iron(0).getName() )){
                    nutrient.milligrams *= nutrient.milligrams; //ridiculous placeholder test for Water to come next.
                    found = true;
                    System.out.println("found Iron! multiplied!");

                    break;
                }
            }
            if (!found){
                nutrients.add( new Iron(10000));
                System.out.println("not found.  added Iron to list.");
                System.out.println(new Iron(0).getName());
            }
        }
    }



}
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

    //1 gram of protein has 4 kcal
    //this donut has 190 kcal ==> 190,000 kcal.
    //IN COMMON SPEECH, CALORIE IS USED TO REFER TO KCAL.

    //that donut has 60 g... if that's all fat ==> 540 kcal
    //                       if all carbs      ==> 240 kcal
    // therefore cannot be purely calories. rest must be water.
*/