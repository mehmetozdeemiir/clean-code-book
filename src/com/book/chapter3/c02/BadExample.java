package com.book.chapter3.c02;

import com.book.bl.Autowired;

public class BadExample {

    @Autowired
    private HelperClass helperClass;

    // Soru: bu fonksiyonun içinden x tane daha fonsiyon çıkar mı?
    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (channelRequest.isPostback() && channelRequest.isEarlyControl()){ // Ne anlatıyor?
            /*

             */
            helperClass.getButtonAnswer();
        }

        String nlpResult = helperClass.nlpEngine();
        /*
            Uzayabilir...
         */
        helperClass.getAnswer(nlpResult);
    }

}
