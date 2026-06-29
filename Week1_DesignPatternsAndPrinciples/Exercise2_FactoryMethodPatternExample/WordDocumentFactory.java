package Exercise2_FactoryMethodPatternExample;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
    
}
