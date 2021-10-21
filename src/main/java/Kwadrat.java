public class Kwadrat extends Czworokat{
    double a;
    @Override
    public double ObliczPole() {
        return a*a;
    }

    @Override
    public double ObliczObwod() {
        return 4*a;
    }
}
