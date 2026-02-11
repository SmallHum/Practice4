public class ReportCreator extends DocumentCreator{
    @Override
    public IDocument createDocument(){
        return new Report();
    };
}
