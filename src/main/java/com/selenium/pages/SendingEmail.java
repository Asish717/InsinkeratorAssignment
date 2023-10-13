package com.selenium.pages;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class SendingEmail {

    public void emailFormat() throws EmailException {
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("C:\\Users\\asish\\Downloads\\commercial-ss-series-en-in-7297692.pdf");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Attachment test");
        attachment.setName("test");
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.gmail.com");             // Gmail SMTP server
        email.setSmtpPort(465);                          // SMTP port for Gmail with SSL
        email.setAuthenticator(new DefaultAuthenticator("adash1@gitam.in", "asish717@"));
        email.setSSLOnConnect(true);
        email.setFrom("adash1@gitam.in", "Asish");
        email.setSubject("sending attachment");
        email.setMsg("Sending a doc attachment through email.");
        email.addTo("asishkumar829@gmail.com", "dash");

        email.attach(attachment);

        email.send();
    }
}
