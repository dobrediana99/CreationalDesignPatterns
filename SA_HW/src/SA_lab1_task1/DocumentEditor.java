package SA_lab1_task1;

public class DocumentEditor {
    private Document document;

    public DocumentEditor(String docType) {
        this.document = DocumentFactory.createDocument(docType);
    }

    public void saveDocument(String content) {
        try {
            document.save(content);
        } catch (Exception e) {
            System.out.println("Error saving document: " + e.getMessage());
        }
    }

    public void displayDocument() {
        try {
            document.display();
        } catch (Exception e) {
            System.out.println("Error displaying document: " + e.getMessage());
        }
    }
}

