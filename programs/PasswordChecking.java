package programs;
/*
 * At least one numeric digit
 * At least one capital Letter
 * Must not have Space or slash(/)
 * Starting character must not be a number
 */

import java.util.*;
//import java.util.regex.Pattern;

public class PasswordChecking {
    public static boolean checkPassword(String password){
        int numeric=0,capital=0;
        if(password.charAt(0)>='0' && password.charAt(0)<='9'){
            return false;
        }
        for(char c: password.toCharArray()){
            if(c>=65 && c<=91)
                capital++;
            if(c==' ' || c=='/')
                return false;
            if(c>='0' && c<='9')
                numeric++;

        }
        if(capital==0 || numeric==0){
            return false;
        }
        
        return true;
    }

    // public static boolean regeXPassword(String password){
    //     System.out.println(Pattern.matches("[A-Z]+[0-9]+", password));

    //     return true;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        System.out.println(checkPassword(password));
        // regeXPassword(password);
        sc.close();
    }
}
