import java.util. *;
class Area
{
  public static void main (String[] args){
    double width, height, area;
    Scanner scan = new Scanner(System.in);
    System.out.println("type two doubles for the width and height of a rectangle");
    width = scan.nextDouble ();
    height = scan.nextDouble ();
    assert ( width > 0 & height > 0);
    area = width * height;
    System.out.print("The area is ");
    System.out.println(area);
  }
}


//* after util indicates that you might use any classes in the package.