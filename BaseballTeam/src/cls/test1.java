package cls;

import dao.MemberDao;
import dto.HumanDto;

public class test1 {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		HumanDto[] book = new HumanDto[5];
		book = dao.getMemberBook();
		System.out.println(book);
		
		for (HumanDto humanDto : book) {
			System.out.println(humanDto);
		}
		

	}

}
