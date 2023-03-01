package chap_06;

public class _03_Return {

    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress(){
        return "서울시 어딘가";
    }

    public static void main(String[] args) {
        //반환값
        System.out.println("전화 번화: " + getPhoneNumber());
        System.out.println("호텔 주소: " + getAddress());
    }
}
