package chap_06;

public class _Quiz_06 {
    public static void main(String[] args) {
        String name = "김뫄뫄";
        String id = "010101-4010101";
        String phone = "010-000-0000";

        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민등록번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phone, 9));


    }


    public static String getHiddenData(String info, int n) {
        String result = info.substring(0, n);
        for (int i = 0; i < info.length() - n; i++) {
            result += "*";
        }
        return result;
    }
}
