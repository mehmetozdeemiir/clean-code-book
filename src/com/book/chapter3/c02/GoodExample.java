package com.book.chapter3.c02;

import com.book.bl.Autowired;

public class GoodExample {

    //base metot şişmemeli bu kullanım daha doğru içerisinde gerçekleşen logicleri ayrı olarak metoda çıkabiliriz.

    @Autowired
    private HelperClass helperClass;

    //Soru bu fonksiyonun içinden x tane daha fonsiyon çıkar mı?
    public void getAnswerFlow(ChannelRequest channelRequest) {
        if (!checkNlpNeed(channelRequest)){
            helperClass.getButtonAnswer();
        }
        getAnswerWithNlpEngine(channelRequest);
    }

    public boolean checkNlpNeed(ChannelRequest channelRequest) {
        if (channelRequest.isEarlyControl() && channelRequest.isPostback()) {
            return false;
        }
        return true;
    }

    public void getAnswerWithoutNlpEngine(ChannelRequest channelRequest) {
        helperClass.getEarlyAnswer();
    }

    public void getAnswerWithNlpEngine(ChannelRequest channelRequest) {
        String nlpResult = helperClass.nlpEngine();
        helperClass.getAnswer(nlpResult);
    }
}
