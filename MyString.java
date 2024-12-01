public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                newstr += (char) (str.charAt(i) + 32);
            }
           // if (str.charAt(i) > 96 && str.charAt(i) < 123 || str.charAt(i) == 32) {
           //     newstr += (char) str.charAt(i);
             else {
                newstr += str.charAt(i);
            }

        }
        return newstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // Replace the following statement with your code
        if (str2.compareTo("") == 0) {return true;}
        while (firstchar(str1, str2.charAt(0)) != -1) {
            int i = firstchar(str1, str2.charAt(0));
            String s = miniString(str1, i, i + str2.length());
            if(s.compareTo(str2) == 0) {return true;}
            else {
                str1 = removeOne(str1, str1.indexOf(str2.charAt(0)));
            }
            if (str1.length() < str2.length()) {return false;}
            if (str1.compareTo(str2) != 0 &&  str1.length() == str2.length()) {return false;}
        }
        return false;
    }

    public static int firstchar(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {return i;}
        }
        return -1;
    }

    public static String miniString(String str, int x, int y) {
        String s = str.substring(x, y);
        return s;

    }
    public static String removeOne(String str, int x) {
        str = str.substring(0, x) + str.substring(x + 1);
        return str;

    }
}
