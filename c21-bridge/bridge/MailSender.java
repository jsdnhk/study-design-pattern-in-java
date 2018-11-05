package c21.bridge.mail;
public abstract class MailSender {
	protected Mail mail;
	
	@SuppressWarnings("unused")
	private MailSender(){};
	
	public MailSender(Mail mail){
		this.mail = mail;
	}
	
	// 寄信
	abstract public void send();
}

//一般信件
public class NormalMail extends MailSender{
	public NormalMail(Mail mail) {
		super(mail);
	}
	@Override
	public void send() {
		System.out.print(">>信件寄出後3~5天內抵達  ");
		super.mail.resgiterState();
	}
}

//限時信
public class PromptMail extends MailSender{
	public PromptMail(Mail mail) {
		super(mail);
	}

	@Override
	public void send() {
		System.out.print(">>信件寄出後24小時內抵達  ");
		super.mail.resgiterState();
	}
}
