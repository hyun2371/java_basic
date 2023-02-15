package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //== 배열 선언 방법==//
        String[] arr1 = new String[4];
        String arr2[] = new String[4];

        arr1[0] = "아메리카노";
        arr1[1] = "카페모카";
        arr1[2] = "라떼";
        arr1[3] = "카푸치노";

        //선언과 동시에 초기화
        String[] arr3 = new String[]{"아메리카노", "카페모카", "라떼", "카푸치노"};

        String[] arr4 = {"아메리카노", "카페모카", "라떼", "카푸치노"};


        System.out.println("-------------------");

        int[] i = new int[3];
        i[0] = 1;
        i[1] = 1;
        i[2] = 3;

        double[] d = new double[]{10.3, 11.2};
        boolean[] b = {true, true, false};

    }
}
