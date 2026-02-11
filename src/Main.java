import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // в данном проекте не особо нужны отдельные создатели для каждого
        // класса имхо на самом деле
        // ну типа чё там в этом классе из аттрибутов которые нужно
        // определённым образом инициализировать
        // ничего?

        // если бы они потребовались, то
        // тогда весь нынешний функционал в DocumentCreator
        // стоило бы перенести в какой нибудь DynamicDocumentFactory

        String message = "";
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("NAME A CLASS");
            message = scanner.nextLine();
            if(message.equals("bye")){
                System.out.println("BYYE");
                break;
            }
            IDocument doc = DocumentCreator.createDocument(message);
            if(doc == null)
                System.out.println("INVALID CLASS");
            else
                doc.open();
        }
    }
}