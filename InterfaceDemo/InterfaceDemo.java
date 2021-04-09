package InterfaceDemo;

public class InterfaceDemo {

    public static void main(String[] args) {

        Square square = new Square();
        Triangle triangle = new Triangle();
        Diamond diamond = new Diamond();

        Shape[] shapes = {square, triangle, diamond};

        for (Shape shape: shapes) {
            //shape.draw();
        }

        Windoze windoze = new Windoze();
        windoze.draw();

        Drawable[] drawables = {square, triangle, windoze};

        for (int i = 0; i < drawables[0].getNumberOfLines(); i++) {
            for (Drawable d: drawables) {
                d.drawStage(i);
            }
            System.out.println();
        }
    }
}
