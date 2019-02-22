package Fase2;

public class Propeller {
    public int maxPower;

    public Propeller (int maxPower)   throws Exception {
        if (maxPower<0) throw new Exception();
        this.maxPower = maxPower;
    }

    public int getMaxPower() {
        return maxPower;
    }
}