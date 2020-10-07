
package kata1;

import java.util.Date;

/**
 *
 * @author Jonathan
 */
public class Kata1 {


    public static void main(String[] args) {
        System.out.println("hola mundo");
        Person person = new Person("Jonathan", new Date(91,9,29));
        System.out.println(person.getName() + " tiene" + person.getAge() + "años");
        
    }
    
}
