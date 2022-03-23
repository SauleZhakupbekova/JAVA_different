package L5_Methods;

public class StringUtils { // not needed to cause psvm. Here we only define structure and methods
    // class structure:
    // 1 - variables
    // 2 - constructors
    // 3 - methods

    /**
     * // comments on a lot of rows /**
     * Method taking text and returning qty of vowel letters in text
     * 1 - modifier of access (definer of visibility):
     * public - visible for full project
     * protected - visible for current package, for class and for child class
     * private - visible for current class only
     * _______ - visible for current package and class
     * <p>
     * 2 - static - not to apply to object or variables
     * 3 - returning type (int, String or other). At the end should be return
     * 3.1 void - not returning type
     * 4 - name of methode (by small letters, named by us
     * 5 - parameters for calculations
     * 6 - body (formula or command)
     */
    public static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o' || text.charAt(i) == 'y' || text.charAt(i) == 'u' || text.charAt(i) == 'i' || text.charAt(i) == 'e') {
                count++;
            }
        }
        return count;
    }

    //Methode taking text and returning reversed text by words
    public static String reversedText(String text) {
        String[] words = text.split("\\s+");  // "\\s+" - regular expression for split by one space.
        // '0-9' - regular expression for search of one number from 0 to 9;
        //'0-9'+ - regular expression for search of several numbers from 0 to 9
        // "\\d+" - regular expression for search of several numbers (decimal)
        String result = "";
        for (int i = 0; i < words.length; i++) { //we remove () after length because words is list
            result += new StringBuilder(words[i]).reverse().toString() + " ";
        }
        return result;
    }

    //Method taking text and printing to console its codding format - each letter change on next letter from alphabet
    public static void coddingText(String text) {
        String alphabet = "abcdefghijklmnopqrstuvwxyza";
        String result = "";
        for (int i = 0; i < text.length(); i++) {// we remain () after length because text is String but not List
            int index = alphabet.indexOf(text.charAt(i)); // text give letter by position i (charAt - index by position of letter)
            if (index != -1) { // -1 means letter in alphabet. see FnF4
                result += alphabet.charAt(index + 1);
            } else {
                result += text.charAt(i);
            }
        }
        System.out.println(result);
    }
}
