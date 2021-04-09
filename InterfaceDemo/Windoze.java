package InterfaceDemo;

import java.util.ArrayList;

public class Windoze implements Drawable {

    private ArrayList<String> lines = new ArrayList<>();

    public Windoze() {

        lines.add("_+_-__");
        lines.add("|    |");
        lines.add("|    |");
        lines.add("|    |");
        lines.add("______");
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
