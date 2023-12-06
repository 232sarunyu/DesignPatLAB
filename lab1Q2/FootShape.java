import java.util.Scanner;
public class FootShape {

    /**
     * @param args the command line arguments
     */
    private Foot foot;
    public FootShape(Foot foot) {
        this.foot = foot;
    }

    Ellipse ellipse = new Ellipse();
    Rectangle rectangle = new Rectangle ();



    public static String drawAsEllipse() {
        return Ellipse.draw();
    }

    public static String drawAsRectangle() {
        return Rectangle.draw();
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please choose shape type 1. Ellipse, 2. Rectangle");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                System.out.println(FootShape.drawAsEllipse());
                break;
            case 2:
                System.out.println(FootShape.drawAsRectangle());
                break;
        }

    }
}
