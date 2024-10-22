package SA_lab1_task1;

public class Main {
    public static void main(String[] args) {
        // Create and work with a PDF document
        DocumentEditor pdfEditor = new DocumentEditor("pdf");
        pdfEditor.saveDocument("This is PDF content");
        pdfEditor.displayDocument();

        System.out.println("---");

        // Create and work with a Word document
        DocumentEditor wordEditor = new DocumentEditor("word");
        wordEditor.saveDocument("This is Word content");
        wordEditor.displayDocument();

        System.out.println("---");

        // Create and work with an HTML document
        DocumentEditor htmlEditor = new DocumentEditor("html");
        htmlEditor.saveDocument("This is HTML content");
        htmlEditor.displayDocument();

        System.out.println("---");

        // Create and work with a Markdown document
        DocumentEditor markdownEditor = new DocumentEditor("markdown");
        markdownEditor.saveDocument("This is Markdown content");
        markdownEditor.displayDocument();
    }
}

