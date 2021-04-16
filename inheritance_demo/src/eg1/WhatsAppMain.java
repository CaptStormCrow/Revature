package eg1;

public class WhatsAppMain {
    public static void main(String[] args) {

        WhatsAppV3 v3=new WhatsAppV3();
        v3.textMessage();
        v3.sendMoney();
        v3.videoCalling();
        v3.voiceMessage();
        v3.groupMessages();
        System.out.println(v3.getClass());
        System.out.println(v3.hashCode());
    }
}
