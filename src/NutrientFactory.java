/**
 * Created by IAN on 16/11/14.
 */
public class NutrientFactory extends AbstractFactory {
    @Override
    Food getFood(String foodType) {
        return null;
    }

    @Override
    Nutrient getNutrients(String nutrientType) {
        if (nutrientType.equals("calcium")) {
            return new Calcium(0);

        } else if (nutrientType.equals("carbohydrate")) {
            return new Carbohydrate(0);

//        } else if (nutrientType.equals("folate")){
//        } else if (nutrientType.equals("iron")){
//        } else if (nutrientType.equals("magnesium")){
//        } else if (nutrientType.equals("potassium")){
//        } else if (nutrientType.equals("vitamin_a")){
//        } else if (nutrientType.equals("vitamin_c")){

        } else {
            return null;
        }

    }
}
