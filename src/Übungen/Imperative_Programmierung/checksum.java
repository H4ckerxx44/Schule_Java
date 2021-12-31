package Imperative_Programmierung;

public class checksum
{

    public static void main(String[] args)
{
        System.out.println(checksum(25));
    }

    public static int checksum(int num)
{

        int checksum = 0;
        int i = num;

        while (i > 0)
{
            if (i % 10 == 0)
{
                i = i / 10;
            } else
{
                checksum = checksum + 1;
                i = i - 1;
            }
        }
        return checksum;
    }
}
