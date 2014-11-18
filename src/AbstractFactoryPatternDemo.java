/**
 * Created by IAN on 18/11/14.
 */
public class AbstractFactoryPatternDemo {
    //get food factory
    AbstractFactory foodFactory = FactoryProducer.getFactory("FOOD");

    //get an object of Food Bagel
    Food food1 = foodFactory.getFood("BAGEL");

    //call ??which?? method of Food Bagel


}
