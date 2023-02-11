package chap_01;

public class _05_TypeCasting {
    public static void main(String[] args) {
        int score = 93;
        double score_d = 98.3;

        System.out.println((double)score);
        System.out.println((int)score_d);

        score = 93 + (int) score_d;
        System.out.println("score= " + score);

        score_d = 93 + 98.8;
        System.out.println("score_d = " + score_d);


        // int -> long -> float -> double (자동 형변환)
        double convertedScoreDouble = score; // 191 -> 191.0

        /// double -> float -> long -> int (수동 형변환)
        int convertedScoreInt = (int) score_d; //191.8 -> 191



        // int -> String
        String s1 = String.valueOf(93); // i)
        s1 = Integer.toString(93); // ii)


        //Double->String
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);


        //String -> Int
        int i = Integer.parseInt("93");
        double d = Double.parseDouble("98.8");

    }
}
