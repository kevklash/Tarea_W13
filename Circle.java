public class Circle
extends GeometricObject{
  private double radius;

  /* *Constructor */
  public Circle(){
    this.name = "";
    this.radius = 0;
    this.identifier = 0;
  }

  /* *Parameterized Constructor */
  public Circle(String name, double radius, int identifier, int x, int y){
    this.radius = radius;
    this.identifier = identifier;
    this.name = name;
    this.x = x;
    this.y = y;
  }

  /* *Getters */
  public double getRadius(){
    return radius;
  }

   /* *Setters */
  public void setRadius(double radius){
    this.radius = radius;
  }

  /* *Overriding Parent Methods */
  @Override
  public int[] getCoord(){
    int[] coord = {x, y};
    return coord;
  }

  @Override
  public double getArea(){
    return Math.PI * Math.pow(this.radius, 2);
  }

}