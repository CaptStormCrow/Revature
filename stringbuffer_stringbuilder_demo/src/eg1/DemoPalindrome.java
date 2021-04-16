package eg1;

public class DemoPalindrome {

    public static void main(String[] args) {
        String s="madam1";
        if(new StringBuilder(s).reverse().toString().equals(s)){
            System.out.println("Yes its palindrome");
        }else{
            System.out.println("No its not palindrome");
        }
    }
}
