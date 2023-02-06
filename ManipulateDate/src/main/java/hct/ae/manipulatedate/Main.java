/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.manipulatedate;

/**
 *
 * In this code, we first accept a date in the format "dd/MM/yyyy" from the user using the Scanner class. 
 * Then we create an instance of SimpleDateFormat with the desired date format. 
 * We then parse the input date string using the parse method of SimpleDateFormat class, 
 * which returns a Date object. Finally, we display the date using the format method of the SimpleDateFormat class.
 * 
 * @author nlakhal
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in the format dd/MM/yyyy: ");
        String inputDate = sc.nextLine();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = formatter.parse(inputDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        System.out.println("Date: " + formatter.format(date));
    }
}
