package Support;

import jdk.jfr.Description;
import jdk.jfr.Name;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class BigIntegerMethods
{
    @Name("getDivisors")
    @Description("Returns divisors of BigInteger in ArrayList")
    public static ArrayList<BigInteger> getDivisors(BigInteger b)
    {
        ArrayList<BigInteger> divisors = new ArrayList<>();
        for (BigInteger i = BigInteger.valueOf(1); i.compareTo(b.sqrt()) < 1; i = i.add(BigInteger.ONE))
        {
            if (b.mod(i).equals(BigInteger.ZERO))
            {
                divisors.add(i);
                if (!i.equals(b.divide(i)))
                    divisors.add(b.divide(i));
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    @Name("sumList")
    @Description("Returns BigInteger sum of ArrayList")
    public static BigInteger sumList(ArrayList<BigInteger> b)
    {
        BigInteger b_sum = BigInteger.ZERO;
        for (BigInteger a : b)
            b_sum = b_sum.add(a);
        return b_sum;
    }

    @Name("isPerfect")
    @Description("Returns BigInteger with -1 if deficient, 0 if perfect, and 1 if abundant")
    public static BigInteger isPerfect(BigInteger b)
    {
        BigInteger result = sumList(getDivisors(b)).subtract(b);
        return BigInteger.valueOf(b.compareTo(result));
    }
}
