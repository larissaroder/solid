package com.example.isp.bad;

public class NotifierEmail implements Notifier {

    @Override
    public String notifyEmail() {
        return "OK";
    }

    @Override
    public String NotifySms() {
        throw new UnsupportedOperationException();
    }
}