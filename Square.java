public class Square {
private double side;
public Square() {
	this.side=0;
}
public Square(double s) {
	this.side=s;
}
public double getArea() {
	return side*side;
}
@Override
public String toString() {
	return "Square [side=" + side + ", getArea()=" + getArea() + "]";
}

}
