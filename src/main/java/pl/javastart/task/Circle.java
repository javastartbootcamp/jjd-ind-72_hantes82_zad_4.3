package pl.javastart.task;

class Circle {
    int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    double calculateCircleArea(Circle circle) {
        final double pi = Math.PI;
        return pi * Math.pow(r, 2);
    }
}
