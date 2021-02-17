package creationalpatterns.prototype;

import lombok.SneakyThrows;

public class App1 {
    @SneakyThrows
    public static void main(String[] args) {
        GeneralEntityService generalEntityService = new GeneralEntityService();

        long start1 = System.currentTimeMillis();
        Document document1 = generalEntityService.findDocumentById(1L);
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        Document document2 = generalEntityService.findDocumentById(2L);
        long end2 = System.currentTimeMillis();

        // Efficient
        long start3 = System.currentTimeMillis();
        Document document1Clone = document1.clone();
        long end3 = System.currentTimeMillis();

        System.out.println(document1 + "\n" + (end1 - start1) / 1000);
        System.out.println(document2 + "\n" + (end2 - start2) / 1000);
        System.out.println(document1Clone + "\n" + (end3 - start3) / 1000);

    }
}
