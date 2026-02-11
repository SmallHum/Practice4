public class Main {
    public static void main(String[] args) {
        DocumentCreator creator_1 = new ReportCreator();
        IDocument document_1 = creator_1.createDocument();
        document_1.open();

        DocumentCreator creator_2 = new ResumeCreator();
        IDocument document_2 = creator_2.createDocument();
        document_2.open();

        DocumentCreator creator_3 = new LetterCreator();
        IDocument document_3 = creator_3.createDocument();
        document_3.open();
    }
}