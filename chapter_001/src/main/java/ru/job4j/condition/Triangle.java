package ru.job4j.condition;

public class Triangle {



    public double period(double a, double b, double c) {
        return (a +b + c) / 2;
    }

    private boolean exist(double a, double c, double b) {
        return !(a >= b + c) && !(b >= a + c) && !(c >= b + a);
    }
    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
     return rsl;
    }
}
