package Challenges;

import java.math.BigInteger;

// TODO: DONE

public class ProjectEuler12
{
    public static void main(String [] args)
    {
        boolean unsatisfied = true;
        BigInteger index = BigInteger.ONE;
        BigInteger current_value = BigInteger.ZERO;
        while (unsatisfied)
        {
            current_value = current_value.add(index);
            int length = Support.BigIntegerMethods.getDivisors(current_value).size();
            if (length > 500)
                unsatisfied = false;
            index = index.add(BigInteger.ONE);
        }
        System.out.println(current_value);
    }
}
