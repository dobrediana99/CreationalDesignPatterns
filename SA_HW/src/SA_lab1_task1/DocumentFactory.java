package SA_lab1_task1;

public class DocumentFactory {
    public static Document createDocument(String docType) {
        switch (docType.toLowerCase()) {
            case "pdf":
                return new PDFDocument();
            case "word":
                return new WordDocument();
            case "html":
                return new HTMLDocument();
            case "markdown":
                return new MarkdownDocument();  // New format added here
            default:
                throw new IllegalArgumentException("Unknown document type: " + docType);
        }
    }
}

