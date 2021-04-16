package eg1;

public class TitleCaseDemo {
    public static void main(String[] args) {
        String s="hello hi good evening everyone";
        String ar[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<ar.length;i++){
            sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
        }
        System.out.println(sb.toString().trim());

        String s1 = "Hello my favorite animal is a bear.";
        String ar1[]=s1.split(" ");
        StringBuilder sb1= new StringBuilder();
        for (int i=0; i<ar1.length; i++){
            int varI = ar[i].length();
            if (varI%2 == 0){
                sb1.append(Character.toUpperCase((ar[i].charAt(0))).append(ar[i].substring(1)).append(" "));
            }else{
                int mLen = varI/2+1;
                sb.append(ar[i].substring(0,mLen-1)).append(Character.toUpperCase(ar[i].charAt(mLen-1))).append(ar[i].substring(mLen)).append(" ");
            }
        }
        System.out.println(sb.toString().trim());
            }
        }



//1) Try converting every word's last letter to uppercase
//2) If the length of the word is odd then convert the middle letter to uppercase else convert the first letter to uppercase.