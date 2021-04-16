package eg2;

import java.io.FileNotFoundException;

public class Presenter {
    public static void main(String[] args) {

        Business b=new Business();
        try {
            b.openFile("hello.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
