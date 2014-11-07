/**
 * Created by IAN on 07/11/14.
 */
public class Tester {
    public static void main(String[] args){

        NutrientEnum n = NutrientEnum.PROTEIN;
        System.out.println (n);  //n.grams doesn't exist


        //trying to learn from oracle docs now
        String[] arggs = new String[1];
        arggs[0] = Integer.toString(175);
        Planet.main(arggs);
        //ok this works but these aren't objects... exactly?
        System.out.println (Planet.G);
        System.out.println (Planet.EARTH.surfaceGravity());
        System.out.println (Planet.MARS.surfaceGravity());

        //enum types cannot be instantiated.
        //Planet p = new Planet(5,5);

        Planet pe = Planet.EARTH;
        pe.surfaceGravity();
        System.out.println( pe.surfaceGravity() );

        //enum types cannot be instantiated.
        //Direction d = new Direction();
        Direction dd = Direction.ENUM_DOWN;
        dd.getEnumX();
        dd.getEnumY();
        System.out.println( dd.getEnumX() );
        System.out.println( dd.getEnumY() );

    }
}
