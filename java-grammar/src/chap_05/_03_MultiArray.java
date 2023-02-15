package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원 배열

        /*
        소규모 영화관 좌석
        A1 - A5
        B1 - B5
        C1 - C5
         */

        String[] seatA = new String[]{"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = new String[]{"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = new String[]{"C1", "C2", "C3", "C4", "C5"};


        // 3 x 5 크기의 2차원 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // C5에 접근
        System.out.println(seats[2][4]);


        // 첫 줄 3칸, 둘째 줄 4칸, 셋째 줄 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        System.out.println(seats2[1][3]);
        //System.out.println(seats2[0][4]); // A5에 접근하면 오류


        // 3차원 배열 (참고만)
        String[][][] m_arr = new String[][][]{
                {{}, {}, {}},
                {{}, {}, {}},
                {{}, {}, {}},
        };

    }
}
