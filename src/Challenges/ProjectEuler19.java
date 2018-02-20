package Challenges;

// TODO: DONE

public class ProjectEuler19
{
    public static void main(String [] args)
    {
        int[] month_length = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day_of_the_week = 0;
        int number_of_sundays = 0;

        for (int i = 1901; i < 2001; i++)
        {
            for (int j = 0; j < 12; j++)
            {
                if (i % 4 == 0)
                    month_length[1] = 29;
                else
                    month_length[1] = 28;
                if (day_of_the_week == 0)
                    number_of_sundays++;
                day_of_the_week += month_length[j];
                day_of_the_week %= 7;
            }
        }

        System.out.println(number_of_sundays);
    }
}
