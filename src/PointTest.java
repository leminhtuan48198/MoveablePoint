public class PointTest {
    public static void main(String[] args) {
        Point point=new Point();
        point.setXY(2,3);
        System.out.println(point);
        point=new Point(1,2);
        System.out.println(point);
    }
}
