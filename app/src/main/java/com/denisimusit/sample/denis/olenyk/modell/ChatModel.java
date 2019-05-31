package com.denisimusit.sample.denis.olenyk.modell;

public class ChatModel {
    private String masge;
    private String date;
    private String status;

    public ChatModel(String masge, String date, String status) {
        this.masge = masge;
        this.date = date;
        this.status = status;
    }

    public String getMasge() {
        return masge;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ChatModel{" +
                "masge='" + masge + '\n' +
                ", date='" + date + '\n' +
                ", status='" + status + '\n' +
                '}';
    }
}
