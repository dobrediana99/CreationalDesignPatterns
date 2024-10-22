package SA_lab1_task1;

public class HTMLDocument implements Document {
    @Override
    public void save(String content) {
        System.out.println("Saving HTML document with content: '" + content + "'");
    }

    @Override
    public void display() {
        System.out.println("Displaying HTML document.");
    }
}
