class Triangle extends Shape {
  private int a;
  private int b;
  private int c;

  public Triangle(String n, int a, int b, int c) {
    super(n);
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public float calculateArea() {
    return 1.2f;
  }
}