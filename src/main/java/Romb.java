public class Romb extends Czworokat{
    double a;
    double kat;
    @Override
    public double ObliczPole() {
        return a*a*Math.sin(kat);
    }

    @Override
    public double ObliczObwod() {
        return 4*a;
    }
}
