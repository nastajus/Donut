import java.util.ArrayList;

/**
 * Created by IAN on 18/11/14.
 */
abstract class Fruit extends Food implements Growable {

    boolean isGrown = false;

    Fruit(){};

    Fruit(double weight, ArrayList<Nutrient> nutrients){
        super(weight, nutrients);
    }

    @Override
    public void Grow() {
        if (!isGrown){
            isGrown = true;
            boolean found = false;
            for( Nutrient nutrient : nutrients ){
                System.out.println ("looking at : " +  nutrient.getName() );
                System.out.println ( "Examining nutrient.getName(): " + nutrient.getName() + " vs. new Water(0).getName(): " + new Water(0).getName());
                if (nutrient.getName().equals( new Water(0).getName() )){
                    nutrient.milligrams *= nutrient.milligrams; //ridiculous placeholder test for Water to come next.
                    found = true;
                    System.out.println("found Water! multiplied!");

                    break;
                }
            }
//            if (!found){
//                nutrients.add( new Water(10000));
//                System.out.println("not found.  added Water to list.");
//                System.out.println(new Water(0).getName());
//            }
        }
    }

}
