public class Triangle
extends GeometricObject{
  private double base;
  private double height;

  /* *Constructor */
  public Triangle(){
    this.name = "";
    this.base = 0;
    this.height = 0;
    this.identifier = 0;
  }

  /* *Parameterized Constructor */
  public Triangle(String name, double base, double height,  int identifier, int x, int y){
    this.name = name;
    this.base = base;
    this.height = height;
    this.identifier = identifier;
    this.x = x;
    this.y = y;
  }

  /* *Getters */
  public double getBase(){
    return base;
  }

  public double getHeight(){
    return height;
  }
   /* *Setters */
  public void setBase(double base){
    this.base = base;
  }
  
  public void setHeight(double height){
    this.height = height;
  }

  /* *Overriding Parent Methods */
  @Override
  public int[] getCoord(){
    int[] coord = {x, y};
    return coord;
  }

  @Override
  public double getArea(){
    return (this.base * this.height) / 2;
  }

}