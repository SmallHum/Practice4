import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // по сути эти отдельные создатели нужны, но в динамической фабрике
        // это реально ощущается как лишнее колено чтобы усложнение.
        // особенно в джаве, где класс можно получить сразу из строки.
        // поэтому я оставил один статикокласс DocumentCreator в котором
        // уже и происходит логика. она простая

        // берём строку, даём джаве. джава делает магию
        // имя правильное, держи свой объект
        // имя неправильное, или не можем сделать из этого IDocument:
        // нууу незнаю выключи компьютер со своим нуллом
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