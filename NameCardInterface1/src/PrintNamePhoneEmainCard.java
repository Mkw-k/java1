import cls.NameCard;
import inf.PrintNameInterface;

public class PrintNamePhoneEmainCard implements PrintNameInterface {

	@Override
	public void print(NameCard nc) {
		System.out.println("이름:"+nc.name);
		System.out.println("전화번호:"+nc.phone);
		System.out.println("이메일:"+nc.email);

	}

}
