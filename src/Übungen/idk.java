public class idk
{

    public static void main(String[]args)
{
        System.out.println("expected_result: 3.69 my_result: " + increase_value(2.46f, 50));
        System.out.println("expected_result: 3.0 my_result: " + increase_value(3, 0));
        System.out.println("expected_result: 0.0 my_result: " + increase_value(0, 90));
        System.out.println("expected_result: 23.54 my_result: " + increase_value(17.7F, 33));
        System.out.println("expected_result: 23.81 my_result: " + increase_value(17.9F, 33));
    }

    public static float increase_value(float value, int percentage)
{

        float unrounded_value = ((value * 0.01f * (100 + percentage)));
        float rounded_value = ((unrounded_value * 100) + 0.5f);
        rounded_value = (int)rounded_value;
        rounded_value = rounded_value / 100;

        return rounded_value;
    }
}

