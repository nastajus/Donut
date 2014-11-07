//Java float and double primitive types are evil. Don’t use them.
//http://computingat40s.wordpress.com/java-float-and-double-primitive-types-are-evil-dont-use-them/
public class ILoveYouMySillyFloatMain
{
    public static void testWithFloats()
    {
        System.out.println("testWithFloats\n");
        float a = 0.1f;
        float b = 0.1f;
        float c = 0.1f;

        float d = a + b + c;
        float e = d * 3;
        float f = d * 100000;

        System.out.println("a + b + c = d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("");
    }

    public static  void testWithDoubles()
    {
        System.out.println("testWithDoubles\n");

        double a = 0.1;
        double b = 0.1;
        double c = 0.1;

        double d = a + b + c;
        double e = d * 3;
        double f = d * 100000;

        System.out.println("a + b + c = d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("");
    }

    public static void main(String[] args)
    {
        testWithFloats();
        testWithDoubles();
    }
}