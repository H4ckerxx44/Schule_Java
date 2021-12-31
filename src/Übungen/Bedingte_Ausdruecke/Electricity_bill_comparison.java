package Bedingte_Ausdruecke;

public class Electricity_bill_comparison
{

    public static void main(String[] args)
    {

        int annual_consumption = 3536;
        double baseprice1 = 5.75;
        double baseprice2 = 9.85;
        double consumptionprice1 = 23.49;
        double consumptionprice2 = 22.10;

        double unrounded_result1 = (baseprice1 * 12) + ((consumptionprice1 * 0.01) * annual_consumption);
        double unrounded_result2 = (baseprice2 * 12) + ((consumptionprice2 * 0.01) * annual_consumption);

        double rounded_result1 = ((int) ((unrounded_result1 * 100) + 0.5)) * 0.01;
        double rounded_result2 = ((int) ((unrounded_result2 * 100) + 0.5)) * 0.01;


        System.out.println(rounded_result1);
        System.out.println(rounded_result2);

    }
}