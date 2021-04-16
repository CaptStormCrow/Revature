package eg_synch;

public class Printer {

    public static synchronized void printPages(Pages page){
        System.out.print(page.getPage1());
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(" "+page.getPage2());
    }
}
