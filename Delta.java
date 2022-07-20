import java.lang.Math;

public class Delta extends Equacao {
    
    double delta;

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double calculaDelta(){
        delta = Math.pow(getB(), 2) - 4 * (getA() * getC());
        return delta;
    }
}
