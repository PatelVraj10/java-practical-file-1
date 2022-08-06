// this program is prepared by 21ce105_patelvraj
// Design a class named Circle containing following attributes and behavior. 
// • One double data field named radius. The default value is 1. 
// • A no-argument constructor that creates a default circle. 
// • A Single argument constructor that creates a Circle with the specified radius. 
// • A method named getArea() that returns area of the Circle. 
// • A method named getPerimeter() that returns perimeter of it.
// GITHUB LINK :
public class cylinder 
{
    double r=1;
    double h=1;
    double area;

     public cylinder()
    {
        System.out.println("defaault constructor called");
    }
    public cylinder(double a)
    {
        r=a;
    }
    public cylinder(double a,double b)
    {
          r=a;
          h=b;
    }
    public void getarea()
    {
        area=3.14*r*r*h;
        System.out.println("area of cylinder is : "+area);
    }
}