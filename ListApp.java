
public class ListApp {

	public static void main(String[] args) {
	ArrayList<Square> squareList = new ArrayList<Square>(2);
	ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>(2);
	ArrayList<String> StringList = new ArrayList<String>(2);
Square square1=new Square(2);
Square square2=new Square(3);
PointThreeD point1=new PointThreeD(1,1,1);
PointThreeD point2=new PointThreeD(2,3,4);
String String1=new String("sjdasd");
String String2=new String("fajwrjekfd");
System.out.println(squareList.addItem(square1));
System.out.println(squareList.addItem(square2));
System.out.println(pointList.addItem(point2));
System.out.println(pointList.addItem(point1));
System.out.println(StringList.addItem(String2));
System.out.println(StringList.addItem(String1));
System.out.println(squareList.toString());
System.out.println(pointList.toString());
System.out.println(StringList.toString());
	}

}
