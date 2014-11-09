/**
 * Created by IAN on 07/11/14.
 */
public abstract class Nutrient {

    static final double OZ_TO_GRAMS = 28.4;

    double milligrams;

    Nutrient(){
        this.milligrams = 0;
    }

    Nutrient(double milligrams){
        this.milligrams = milligrams;
    }

}
