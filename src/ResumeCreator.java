public class ResumeCreator extends DocumentCreator{
    @Override
    public IDocument createDocument(){
        return new Resume();
    };
}
