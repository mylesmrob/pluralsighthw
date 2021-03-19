package variablesTypesOperators;

public class Main {

    public static void main(String[] args) {

        //Variables
        int var = 50;
        System.out.println(var);
        int anotherVar = 100;
        System.out.println(anotherVar);
        var = anotherVar;
        System.out.println(var);

        //Prefix and Postfix Operators
        int value = 3;
        System.out.println(++value);
        System.out.println(value);
        int otherValue = 9;
        System.out.println(otherValue++);
        System.out.println(otherValue);

        //Compound Assignment Operators
        value = 80;
        value -= 5;
        System.out.println(value);
        otherValue = 100;
        int val1 = 10;
        int val2 = 5;
        otherValue /= val1 * val2;
        System.out.println(otherValue);

        //Operator Precedence
        int valA = 50;
        int valB = 64;
        int valC = 120;
        int valD = 3;
        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;
        System.out.println(result1);
        System.out.println(result2);
        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));
        System.out.println(result3);
        System.out.println(result4);

        //Type Conversion
        float fval = 5f;
        double dval = 10;
        byte bval = 3;
        short sval = 41;
        long lval = 72;
        short r1 = (short) lval;
        short r2 = (short) (bval - lval);
        float r3 = lval - fval;
    }

}
