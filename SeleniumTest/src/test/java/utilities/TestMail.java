package utilities;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class TestMail {

	public static void main(String[] args) throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		
		MonitoringMail mail = new MonitoringMail();
		mail.sendMail(TestMailConfig.server, TestMailConfig.from, TestMailConfig.to, TestMailConfig.subject, TestMailConfig.messageBody);
	}

}
