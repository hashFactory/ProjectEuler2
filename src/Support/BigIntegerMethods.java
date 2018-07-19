package Support;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class BigIntegerMethods
{
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

    public static BigInteger sumList(ArrayList<BigInteger> b)
    {
        BigInteger b_sum = BigInteger.ZERO;
        for (BigInteger a : b)
            b_sum = b_sum.add(a);
        return b_sum;
    }

    public static BigInteger isPerfect(BigInteger b)
    {
        BigInteger result = sumList(getDivisors(b)).subtract(b);
        return BigInteger.valueOf(b.compareTo(result));
    }
}
