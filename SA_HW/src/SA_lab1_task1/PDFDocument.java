package SA_lab1_task1;

public class PDFDocument implements Document {
    @Override
    public void save(String content) {
        System.out.println("Saving PDF document with content: '" + content + "'");
    }

    @Override
    public void display() {
        System.out.println("Displaying PDF document.");
    }
}
