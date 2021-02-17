package creationalpatterns.prototype;

public class App1 {
    public static void main(String[] args) {
        GeneralEntityService generalEntityService = new GeneralEntityService();
        Document document1 = generalEntityService.findDocumentById(1L);

        Document document2 = generalEntityService.findDocumentById(2L);

        System.out.println(document1);
        System.out.println(document2);
        

    }
}
