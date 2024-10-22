package SA_lab1_task1;

public class WordDocument implements Document {
    @Override
    public void save(String content) {
        System.out.println("Saving Word document with content: '" + content + "'");
    }

    @Override
    public void display() {
        System.out.println("Displaying Word document.");
    }
}
