package Übungen.Imperative_Programmierung;

public class palindrom
{

    public static void main(String[] args)
{
        System.out.println(isPalindrom("1331"));
        System.out.println(isPalindrom("13431"));
        System.out.println(isPalindrom("1334331"));
    }

    public static boolean isPalindrom(String text)
{


        int lastpos = text.length();
        int firstpos = 0;


        while (firstpos < lastpos)
{
            if (text.charAt(lastpos-1) == text.charAt(firstpos))
{
                lastpos = lastpos - 1;
                firstpos = firstpos + 1;
            } else
{
                return false;
            }
        }
        return true;
    }
}