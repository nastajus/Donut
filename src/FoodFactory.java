/**
 * Created by IAN on 16/11/14.
 */
public class FoodFactory extends AbstractFactory {

    @Override
    Food getFood(String foodType) {

        if (foodType.equals("donut")) {
            return new Donut();

        } else if (foodType.equals("bagel")) {
            return new Bagel();

//        } else if (foodType.equals("soup")){
//
//        } else if (foodType.equals("sandwich")){
//
        } else {
            return null;
        }

    }

    @Override
    Nutrient getNutrients(String nutrientType) {
        return null;
    }
}
