/**
 * Created by IAN on 07/11/14.
 */
public class Tester {
    public static void main(String[] args){

        Protein p = new Protein(2);
        System.out.println(p.grams);

        //OK, WHAT'S UP. I thought abstract classes couldn't be instantiated
        //http://stackoverflow.com/questions/4579305/can-we-instantiate-an-abstract-class
        //SO says ANONYMOUS classes can be instantiated
        //when typing, my IDE asked me which method to override.
        //therefore, i'm believing this is now an anonymous class instantiation.
        Nutrient n = new Nutrient(3) {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
        System.out.println(n.grams);


    }
}
