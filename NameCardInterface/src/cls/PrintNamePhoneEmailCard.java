package cls;

import inf.PrintNameInterface;

public class PrintNamePhoneEmailCard implements PrintNameInterface {

	@Override
	public void print(NameCard nc) {
		System.out.println("이름:" + nc.name);
		System.out.println("전화전호:" + nc.phone);
		System.out.println("이메일:" + nc.email);
	}

}
