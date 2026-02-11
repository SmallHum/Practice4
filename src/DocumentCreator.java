import java.lang.reflect.InvocationTargetException;

public class DocumentCreator {

    //помню делал в плюсах фабрику в GOVNO-ENGINE
    //там чтобы добавить класс в фабрику, нужно было
    //1. добавить в енам ID класса
    //2. создать функцию getID в классе
    //3. зайти в инициализацию фабрики и дописать добавление
    //     конструктора класса в зависимости от этого енам айдишника

    // я это к тому, что здесь просто вот это написал и всё

    // хотя я видел что-то про CLASS DB в годоте который тоже на плюсах.
    // так что не думаю что это прям проблема языка
    // это у меня руки кривые

    public static IDocument createDocument(String class_name){
        Class<? extends IDocument> cls;
        try {
            cls = Class.forName(class_name).asSubclass(IDocument.class);
            return cls.getDeclaredConstructor().newInstance();
        }
        catch (ClassNotFoundException e){
            //вернём нулл только если класс не был найден/не смогли кастануть
            //это же ошибки пользователя
            return null;
        }
        catch(ClassCastException e){
            return null;
        }catch (InvocationTargetException e) {
            //остальное не думаю что произойдёт
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
