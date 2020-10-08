
package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Jonathan
 */
public class Kata1 {


    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1991,9,29);

        Person person = new Person("Jonathan", date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");
        
    }
    
}
