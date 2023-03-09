package chap_07.camera;

/**
 * factoryCam is a Camera (IS-A)
 *  상속 관계는 IS-A 관계
 */
public class FactoryCam extends Camera{ // 자식 클래스

    public FactoryCam() {
        this.name = "공장카메라";
    }

    public void detectFire(){
        //화재 감지
        System.out.println("화재를 감지합니다");
    }

    @Override
    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
