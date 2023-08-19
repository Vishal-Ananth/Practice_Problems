package programs;
/*
 Given a string, check if it contains only digits.
Input Format
Input contains a string S, consisting of ascii characters.
Constraints
1 <= len(S) <= 100
Output Format
Print "Yes" if string contains only digits, "No" otherwise.
Sample Input 0
123456786543
Sample Output 0
Yes
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlyDigits {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d*$");
        Scanner scanner = new Scanner(System.in);
        String digits=scanner.nextLine();
        Matcher matcher = pattern.matcher(digits);
        boolean found = matcher.find();
        if(found){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scanner.close();
    }
}
