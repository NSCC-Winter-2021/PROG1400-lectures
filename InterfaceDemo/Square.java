package InterfaceDemo;

public class Square extends Shape implements Drawable {

    public Square() {
        lines.add("******");
        lines.add("*    *");
        lines.add("*    *");
        lines.add("*    *");
        lines.add("******");
    }

    @Override
    public void draw() {
        for (String line: lines) {
            System.out.println(line);
        }
    }

    @Override
    public void drawStage(int stage) {
        System.out.print(lines.get(stage));
    }

    @Override
    public int getNumberOfLines() {
        return lines.size();
    }
}
