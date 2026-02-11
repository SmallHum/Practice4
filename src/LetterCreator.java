public class LetterCreator extends DocumentCreator{
    @Override
    public IDocument createDocument(){
        return new Letter();
    };
}
