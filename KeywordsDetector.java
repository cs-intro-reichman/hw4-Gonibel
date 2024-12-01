//import com.apple.laf.resources.aqua;

public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        // Replace this comment with your code
        String str ="";
        for( int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].toLowerCase();
            str += sentences[i];
        }
        for(int i = 0; i < keywords.length; i++) {
            if(contains(str, keywords[i])) {
                System.out.println(keywords[i]);
            }
        }

    }

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


