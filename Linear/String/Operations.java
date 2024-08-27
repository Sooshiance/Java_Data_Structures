package String;

public class Operations
{
    public static void accessByIndex(String str, int k)
    {
        System.out.println(str.charAt(k));
    }

    public static void insertDemo(String str, String ch, int k)
    {
        // Inserts ch at kth index of str
        StringBuilder sb = new StringBuilder(str);
        sb.insert(k, ch);
        String modifiedString = sb.toString();
        System.out.println("Modified String: " + modifiedString);
    }

    public static void modifyCharacters(String str, String chr, int index)
    {
        String s;

        s = str.substring(0, index) + chr + str.substring(index + 1);

        System.out.println("Modified string: " + s);
    }

    public static void removeChar(char[] s, char c)
    {
        int j = 0;
        // Loop through the character array
        for (int i = 0; i < s.length; i++)
        {
            if (s[i] != c)
            {
                s[j++] = s[i];
            }
        }
        // Fill the remaining positions with null characters ('\0')
        while (j < s.length)
        {
            s[j++] = '\0';
        }
    }

    public static void concatnatingString(String s1, String s2)
    {
        result = s1 + s2;

        System.out.println("Concatnated Sting : " + result);
    }

    public static Boolean stringCompare(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++)
        {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);

            if (str1_ch != str2_ch)
            {
                return false;
            }
        }
        
        if (l1 != l2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}