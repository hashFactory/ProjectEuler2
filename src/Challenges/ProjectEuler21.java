package Challenges;

import java.math.BigInteger;
import java.util.ArrayList;

// TODO: DONE

public class ProjectEuler21
{
    public static void main(String [] args)
    {
        ArrayList<BigInteger> amicable = new ArrayList<>();
        for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(10000)) < 1; i = i.add(BigInteger.ONE))
        {
            ArrayList<BigInteger> divisors = Support.BigIntegerMethods.getDivisors(i);
            BigInteger sum = Support.BigIntegerMethods.sumList(divisors).subtract(i);

            ArrayList<BigInteger> b_divisors = Support.BigIntegerMethods.getDivisors(sum);
            BigInteger b_sum = Support.BigIntegerMethods.sumList(b_divisors).subtract(sum);

            if (b_sum.equals(i) && !sum.equals(i))
            {
                if (!amicable.contains(i))
                    amicable.add(i);
                if (!amicable.contains(sum))
                    amicable.add(sum);
            }
        }

        System.out.println(Support.BigIntegerMethods.sumList(amicable));
    }
}
