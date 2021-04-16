package egregex;

public class Regex2Validation {


    public static void main(String[] args) {
        //xxxx-xx-xxx-xxxx   x-digit for the x where the length is 4 the first thing should be uppercase letter
        String s = "A123-22-111-Z00A";
        if (s.matches("[A-Z]{1}[0-9]{3}-[0-9]{2}-[0-9]{3}-[A-Z]{1}[0-9]{3}")) {
            System.out.println("Validated");
        } else {
            System.out.println("Not validated");
        }
    }
}
//Try building Regex to validate mobile number, SSN, DL or any other info.
