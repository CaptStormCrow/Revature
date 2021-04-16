package custom_exception_eg;

public class ValidationMain {
    public static void main(String[] args) {

        Validation v=new Validation();
        try {
            if (v.isValidMobileNumber("+1-1234567890")) {
                System.out.println("Validated");
            }
        }catch (InvalidMobileNumberException e){
            System.out.println(e.getMessage());
        }

        try {
            if(v.isValidAge(34)){
                System.out.println("Yes age validated");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
