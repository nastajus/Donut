/**
 * Created by IAN on 16/11/14.
 */
public abstract class AbstractFactory {

    abstract Food getFood(String foodType);
    abstract Nutrient getNutrients(String nutrientType);

}
