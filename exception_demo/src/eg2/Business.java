package eg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Business {

    public void openFile(String fileName) throws FileNotFoundException,NullPointerException {
        FileInputStream fis=new FileInputStream(fileName);
    }

}
