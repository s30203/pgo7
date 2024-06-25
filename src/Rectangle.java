class Rectangle implements Figure {
    private double storona1;
    private double storona2;
    public Rectangle(double storona1, double storona2) {
        this.storona1 = storona1;
        this.storona2 = storona2;
    }
    @Override
    public double getPerimeter() {
        return 2 * (storona1 + storona2);
    }
    @Override
    public double getArea() {
        return storona1 * storona2;
    }
    @Override
    public String getType() {
        return "Rectangle";
    }
}