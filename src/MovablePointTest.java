public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint p1=new MovablePoint();
        System.out.println(p1);
        p1=new MovablePoint(1,2,3,4);
        System.out.println(p1);
        p1.move();
        System.out.println(p1);
    }
}
