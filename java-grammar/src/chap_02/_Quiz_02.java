package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 115;
        height = 121;
        String s = (height > 120) ? "탑승 가능" : "탑승 불가능";
        System.out.printf("키가 %d이므로 %s합니다",height,s);
    }
}
