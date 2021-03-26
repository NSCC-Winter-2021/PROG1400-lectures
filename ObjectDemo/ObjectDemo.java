package ObjectDemo;

class Computer extends Object {
    private String processor;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Intel: " + processor;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;

        Computer computer = (Computer) obj;

        return processor.equals(computer.processor);
    }
}

public class ObjectDemo {
    public static void main(String[] args) {

        Computer ralph = new Computer();
        ralph.setProcessor("i10");

        System.out.println(ralph);

        Computer potsy = new Computer();
        potsy.setProcessor("i10");

        if (ralph.equals(potsy)) {
            System.out.println("They are equal!");
        }

    }
}
