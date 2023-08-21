package week1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date and time (dd/mm/yy hh:mm:ss) : ");
        String impDate = scanner.nextLine();

        System.out.println("The date object equivalent to the string is : ");
        SimpleDateFormat convertForm = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        Date convert;
        try {
            convert = convertForm.parse(impDate);
            System.out.println(convertForm.format(convert));
        } catch (ParseException e) {
            System.out.println("Invalid Date-Time");
        }
        
        
    }
}