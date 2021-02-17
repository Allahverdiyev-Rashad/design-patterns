package creationalpatterns.prototype;

public class GeneralEntityService {
    public DocumentType findDocumentTypeById(Long id) {
        Thread.sleep(1000);

        DocumentType documentType = new DocumentType();
        documentType.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Personel";
        } else if (id.compareTo(2L) == 0) {
            name = "Corporate";
        } else {
            name = "General";
        }

        documentType.setName(name);

        return documentType;
    }

    public Category findCategoryById(Long id) {
        Thread.sleep(1000);

        Category category = new Category();
        category.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Private";
        } else if (id.compareTo(2L) == 0) {
            name = "Work";
        } else {
            name = "General";
        }

        category.setName(name);

        return category;
    }

    public Document findDocumentById(Long id) {
        Thread.sleep(2000);

        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentTypeById(id));
        document.setCategory(findCategoryById(id));

        String name;
        String data;
        String name;
        if (id.compareTo(1L) == 0) {
            name = "Letter";
            data = "Dear friend Jhon..."
        } else if (id.compareTo(2L) == 0) {
            name = "Report";
            data = "This report for CEO...";
        } else {
            name = "Traffic rules";
            data = "Stop Here for Peds";
        }

        document.setName(name);
        document.setData(data);

        return document;
    }
}
