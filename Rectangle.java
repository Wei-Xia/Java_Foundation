public class Rectangle {

   private int length;
   private int width;

   public void setLength(int val) {
		length = val;
   }

   public void setWidth(int val) {
		width = val;
   }

   public int calcArea() {

		int area;
		area = length * width;
		return (area);

   }

   public int calcPerimeter() {

		int perimeter;
		perimeter = 2 * (length + width);
		return perimeter;

   }


}