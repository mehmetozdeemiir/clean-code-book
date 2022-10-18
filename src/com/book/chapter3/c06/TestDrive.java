package com.book.chapter3.c06;

public class TestDrive {

    public static void main(String[] args) {

        //bir metodun ideal alması gereken argüman sayısı max 3 dür eğer 3 den fazlaysa çok önemli bir sebebi olması gerekli

        // boolean fileExists("myFile")
        // InputStream fileOpen(“MyFile”) //metotlar 0 parametre olucak diye bir kural yok olabildiğince az olmalı. bu metodlarda gerekiyor. örneğin biseyi açmaya çalışıyosam bu metoddaki gibi bişeyi göndermem lazım.


        String file = "file";
        FlagMethod.save(file, true); //gereksiz bir metod 2 işi yapıyor


        FlagMethod.isVersionIncrement(file); //true. BİR METOD ARTIK İKİ İŞİ YAPMIYOR DAHA YÖNETİLEBİLİR OLDU TEK METOD TEK İŞ
        FlagMethod.saveNew(file);//true




    }

}
