package programs;

import java.util.Scanner;
import java.util.regex.*;
/*
 * [abc]    - A single instance of a.b or c
 * [a-z]    - A single character in range a-z
 * a|b  - Matches either a or b
 * \d   - A digit 0-9
 * \w   - A word character: [a-zA-Z_0-9]
 * .    - Any single character
 * a{3} - Exactly 3 of a : aaa
 * a{2,4}   - Between 2 to 4 of a : aa,aaa or aaaa
 * ^    - Begining of a line
 * $    - Matches end of line
 * *    - Matches 0 or more occurrences: combination of + and ?
 * +    - Matches 1 or more occurrences : 
 * ?    - Matches 0 or 1 occurrences    : 
 */

public class RegexPractice {
    public static void main(String[] args) {
        
        /*
        * At least one numeric digit
        * At least one capital Letter
        * Must not have Space or slash(/)
        * Starting character must not be a number
        */

        Pattern pattern = Pattern.compile("^(\\D[A-Z].)");
        Scanner sc = new Scanner(System.in);
        String findThisString = sc.nextLine();
        Matcher matcher = pattern.matcher(findThisString);

        boolean found = matcher.find();
        System.out.println(found);
        sc.close();
    }    
}
