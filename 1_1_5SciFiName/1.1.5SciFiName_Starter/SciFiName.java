
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        firstName = firstName.toLowerCase();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        lastName = lastName.toLowerCase();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        city = city.toLowerCase();
        String tempCity = city.toUpperCase().substring(0, 1);
        city = tempCity + city.substring(1);
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        school = school.toLowerCase();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        relativeName1 = relativeName1.toLowerCase();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();
        relativeName2 = relativeName2.toLowerCase();

        // generate a sciFi name
   
        String scifiName = firstName.substring(0, 3) + lastName.substring(0, 2) + " " + city.substring(0, 2) + school.substring(0, 3) + ".";
        // scifiName = scifiName.substring(0, 1) + scifiName.toUpperCase();
        String tempName = scifiName.toUpperCase().substring(0, 1);
        scifiName = tempName + scifiName.substring(1);
        System.out.println("Welcome,sir/madam " + scifiName);
        // System.out.println(city.substring(0, 2) + school.substring(0, 3));
        int rel1 = (int) ((Math.random() * (relativeName1.length() -1) + 1)); 
        int rel2 = (int) ((Math.random() * (relativeName2.length() -1) + 1));
        System.out.println("Hailing from the land of " + relativeName1.substring(rel1) + relativeName2.substring(rel2) + "!");
    }
}
