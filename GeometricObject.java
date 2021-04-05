public class GeometricObject{
  public String name;
  public int identifier;
  public int x, y;

  /* *Contructor */
  public GeometricObject(){
    this.name = "";
    this.identifier = 0;
    this.x = 0;
    this.y = 0;
  }

  /* *Parameterized Contructor */
  public GeometricObject(String name, int identifier, double x, double y){
    this.name = name;
    this.identifier = identifier;
    this.x = 0;
    this.y = 0;
  }

  /* *Getter */
  public String getName(){
    return name;
  }

  public int getIdentifier(){
    return identifier;
  }

  public int[] getCoord(){
    int[] coord = {x, y};
    return coord;
  }

  /* *Setter */
  public void setName(String name){
    this.name = name;
  }

  public void setIdentifier(int identifier){
    this.identifier = identifier;
  }

  public void setCoord(int x, int y){
    this.x = x;
    this.y = y;
  }

  /* *Member Method */
  public double getArea(){ return 0;  }
}