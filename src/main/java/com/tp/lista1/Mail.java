package com.tp.lista1;

public class Mail {
    private Account recipient;
    private Account adresor;
    private String topic;
    private String content;

    public Mail(Account recipient, Account adresor, String topic, String content){
        this.adresor = adresor;
        this.content = content;
        this.recipient = recipient;
        this.topic = topic;
    }

    public void setRecipient(Account recipient){
        this.recipient = recipient;
    }
    public void setAdresor(Account adresor){
        this.adresor = adresor;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }
    public void setContent(String content){
        this.content = content;
    }

    public Account getRecipient(){
        return recipient;
    }
    public Account getAdresor(){
        return adresor;
    }
    public String getTopic(){
        return topic;
    }
    public String getContent(){
        return content;
    }
}
