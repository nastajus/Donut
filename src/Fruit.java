/**
 * Created by IAN on 18/11/14.
 */
abstract class Fruit extends Food implements Growable {

    @Override
    public void Grow() {
        if (!isGrown){
            isGrown = true;
            boolean found = false;
            for( Nutrient nutrient : nutrients ){
                System.out.println ("looking at : " +  nutrient.getName() );
                if (nutrient.getName().equals( new Water(0).getName() )){
                    nutrient.milligrams *= nutrient.milligrams; //ridiculous placeholder test for Water to come next.
                    found = true;
                    System.out.println("found Water! multiplied!");

                    break;
                }
            }
            if (!found){
                nutrients.add( new Water(10000));
                System.out.println("not found.  added Water to list.");
                System.out.println(new Water(0).getName());
            }
        }
    }

}
