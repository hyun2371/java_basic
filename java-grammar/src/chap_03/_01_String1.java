package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I want to go Paris and Italy and Turkey.";
        System.out.println(s);

        // 문자열 길이
        System.out.println("s.length() = " + s.length());

        // 대소문자 변환
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());

        // 포함 관계
        System.out.println("s.contains(\"Paris\") = " + s.contains("Paris")); //포함 여부
        System.out.println("s.contains(\"Tokyo\") = " + s.contains("Tokyo"));

        System.out.println("s.indexOf(\"Italy\") = " + s.indexOf("Paris")); //위치 정보
        System.out.println("s.indexOf(\"Tokyo\") = " + s.indexOf("Tokyo")); // 포함x -> -1

        System.out.println("s.indexOf(\"and\") = " + s.indexOf("and")); // 처음 일치 위치 정보
        System.out.println("s.lastIndexOf(\"and\") = " + s.lastIndexOf("and")); //마지막 일치 위치 정보

        System.out.println("s.startsWith(\"I want\") = " + s.startsWith("I want")); // 해당 문자열로 시작하는지의 여부
        System.out.println("s.endsWith(\".\") = " + s.endsWith("."));
    }
}
