package chap_07.camera;

public class SpeedCam extends Camera{ // 자식 클래스 (부모는 하나)

    public SpeedCam() {
        this.name = "과속 단속 카메라";
    }

    public void checkSpeed(){
        // 속도 체크
        System.out.println("속도 측정");
    }

    public void recognizeLicensePlate(){
        // 번호 인식
        System.out.println("차량 번호를 인식합니다");
    }

    @Override
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 차량 번호 인식");
    }


}
