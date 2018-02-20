package Support;

import jdk.jfr.Description;
import jdk.jfr.Name;

import java.math.BigInteger;
import java.util.ArrayList;

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
        return divisors;
    }
}
