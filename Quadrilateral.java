
/**
 * Write a description of class Quadrilateral here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 class Quadrilateral extends Shape{
  public double length;
  public double breadth;
  
  public Quadrilateral(double length,double breadth){
      this.length=length;
      this.breadth=breadth;
  }
  @Override
  void calculateArea(){
      double area=length * breadth;
      System.out.println("Area of the Quadrilateral: " + area);
  }
  @Override
  void calculatePerimeter(){
      double perimeter=2 * (length + breadth);
      System.out.println("Perimeter of the Quadrilateral: " + perimeter);
  }
}
