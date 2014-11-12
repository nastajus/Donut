/**
 * Created by IAN on 07/11/14.
 */
public abstract class Nutrient implements Sameable<Nutrient>, Cookable {

    static final double OZ_TO_GRAMS = 28.4;

    double milligrams;  //BigDecimal

    boolean isCooked = false;

    Nutrient(){
        this.milligrams = 0;
    }

    Nutrient(double milligrams){
        this.milligrams = Math.floor( milligrams * 100 / 100);
    }

    public String getName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public boolean isSameAs(Nutrient nutrient) {
        if(this.getName().equals(nutrient.getName())) return true;
        else return false;
    }


}
