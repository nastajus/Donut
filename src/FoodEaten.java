/**
 * Created by IAN on 09/11/14.
 */
public abstract class FoodEaten {
    double portion;
    //http://stackoverflow.com/questions/5250646/can-we-stop-the-run-of-a-constructor
    //Make the constructor private and expose a static factory method, that will validate and return a new instance of the object if the parameter is valid.
    private FoodEaten(double portion){
        this.portion = portion;
    }

    //factory pattern attempt
    abstract FoodEaten create(double portion);

    //validate:
//    if (portion >= 0 || portion <= 1){
//        return new FoodEaten(portion);
//    }
//    return null;

}
