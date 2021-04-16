package custom_exception_eg;

public class Validation {

    public boolean isValidMobileNumber(String contact){
        if(!contact.matches("\\+1-[0-9]{10}")){
            //throw exception
            throw new InvalidMobileNumberException("Entered mobile number "+contact+" is invalid");
        }else{
            return true;
        }
    }

    public boolean isValidAge(int age) throws InvalidAgeException {
        if(age<=0){
            throw new InvalidAgeException("Age cannot be 0 or -ve");
        }
        if(age<19 || age > 33){
            throw new InvalidAgeException("Only users with age between 19 and 33 are allowed");
        }
        return true;
    }
}
