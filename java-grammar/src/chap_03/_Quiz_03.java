package chap_03;

public class _Quiz_03 {

    public static void main(String[] args) {
        String sn = "011234-4543210";
        System.out.println(sn.substring(0,8));
        System.out.println(sn.substring(0, sn.indexOf("-")+2));
    }
}
