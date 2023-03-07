package chap_07;

public class BlackBox {
    // 인스턴스 변수(필드) 정의
    String modelName;
    String resolution;
    int price;
    String color;

    //클래스 변수 ( 모든 객체에 똑같이 적용됨 )
    static boolean canAutoReport = false; //자동 신고 기능

    void autoReport(){
        if (canAutoReport){
            System.out.println("충돌이 감지되어 자동 신고 되었습니다");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다");
        }
    }

    void insertMemoryCard(int capacity){
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity + "GB 입니다");
    }


    int getVideoFileCount(int type){
        if (type == 1) {
            return 9;
        } else if (type == 2) {
            return 1;
        }

        return 10;
    }

    // showDateTime: 날짜정보 표시여부
    // showSpeed: 속도 정보 표시여부
    //  min: 영상 단위
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record(){
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터로 연결합니다");

        // 인스턴스 변수는 클래스 메서드 내에서 수정 불가
        // color = "purple";
        canAutoReport = false;

    }

}
