package Java240617;

public class KiaCar implements Car{

    public String run() {
        return "달리는 중";
    }

    public String run(String engine) {
        return engine + "으로 달리는 중";
    }

    @Override
    public String showEngine() {
        return "엔진이름";
    }

    @Override
    public String amountNavi() {
        return "500,000원";
    }

    @Override
    public String getTire() {
        return "금호타이어";
    }
}
