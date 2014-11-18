/**
 * Created by IAN on 18/11/14.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if ( choice.equalsIgnoreCase("FOOD")){
            return new FoodFactory();
        } else if ( choice.equalsIgnoreCase("NUTRIENT")){
            return new NutrientFactory();
        }
        return null;
    }

}
