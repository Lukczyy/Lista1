public class Prostokat extends Czworokat {
    double a;
    double b;
    @Override
    public double ObliczPole() {
        return a*b;
    }

    @Override
    public double ObliczObwod() {
        return 2*a+2*b;
    }
}
