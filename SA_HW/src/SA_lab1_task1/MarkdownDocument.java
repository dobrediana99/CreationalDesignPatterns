package SA_lab1_task1;

public class MarkdownDocument implements Document {
    @Override
    public void save(String content) {
        System.out.println("Saving Markdown document with content: '" + content + "'");
    }

    @Override
    public void display() {
        System.out.println("Displaying Markdown document.");
    }
}
