package Challenges;

// TODO: DONE

import java.math.BigInteger;

public class ProjectEuler23
{
    public static void main(String [] args)
    {
        boolean[] can_be_written = new boolean[28124], isAbundant = new boolean[28124];
        for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(can_be_written.length)) < 0; i = i.add(BigInteger.ONE))
            isAbundant[i.intValue()] = (Support.BigIntegerMethods.isPerfect(i).equals(BigInteger.ONE.negate()));

        for (int i = 0; i < can_be_written.length; i++)
            for (int j = 0; j < can_be_written.length; j++)
                if ((i + j) < can_be_written.length && (isAbundant[i] && isAbundant[j]))
                    can_be_written[i + j] = true;

        int sum = 0;
        for (int i = 0; i < can_be_written.length; i++)
            if (!can_be_written[i])
                sum += i;

        System.out.println(sum);
    }
}
