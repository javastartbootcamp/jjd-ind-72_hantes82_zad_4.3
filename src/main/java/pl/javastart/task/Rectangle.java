package pl.javastart.task;

class Rectangle {
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * a + 2 * b;
    }
}
