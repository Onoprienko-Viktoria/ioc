package com.onoprienko.ioc.entity;

public class MailServiceWithoutSetters implements IMailService {
    private String protocol;
    private int port;

    @Override
    public void sendEmail(User user, String message) {

    }
}
