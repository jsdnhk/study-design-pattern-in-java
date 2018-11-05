package c21.bridge.mail;

public abstract class Mail {
	// 平信，掛號信，雙掛號信等
	abstract void resgiterState();
}

//非掛號信
public class NoRegisterMail extends Mail{
	@Override
	void resgiterState() {
		System.out.println("這是封信不是註冊信，收件人不用簽名  ");		
	}
}

//掛號信
public class RegisterMail extends Mail{
	@Override
	void resgiterState() {
		System.out.println("這是一封掛號信，收件人必需簽名  ");
	}
}