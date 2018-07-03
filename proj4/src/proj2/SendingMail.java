/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj2;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ASHOK
 */
public class SendingMail {
    
    public static  void sendMail(String to)
    {
        final String username = "varshak333@gmail.com"; // enter your mail id
		final String password = "moonlight123";// enter ur password

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
               

                props.put("mail.smtp.ssl.trust", "smtp.gmail.com");


		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("varshak333@gmail.com")); // same email id
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(to));// whome u have to send mails that person id
			message.setSubject("Notification of Failure of Emergency Device(s) of lift  ");
			message.setText("This is message to both elevator and electrical contractors "
				+ "\n\n Elevator Integration with Fire Alarm Systems");
                        

			Transport.send(message);

			System.out.println("Done mail sent to :" + to);

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
         
    }
    
    
}
