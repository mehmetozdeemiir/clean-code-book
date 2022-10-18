package com.book.chapter3.c14;

public class TestDrive{
    //kitap try catch metodlarının zaten cirkin olduğunu söylüyor bodylerini ayırırsak daha güzel olabileceğinden bahsediyor.
    //try dolmasın metodu farklı bir yerde yazılabilir.

    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        }
        catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndAllReferences(Page page) throws Exception {
        deletePage(page);
        //registry.deleteReference(page.name);
        //configKeys.deleteKey(page.name.makeKey());
    }


    private void logError(Exception e) {
        System.out.println("Log error!");
    }


    public void deletePage(Page page){

    }


}