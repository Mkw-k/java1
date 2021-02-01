package cls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dao.MemberDao;
import dto.HumanDto;

public class DataCls extends MemberDao{
	
	public static void main(String[] args) {
		
//		String saveData = dao.toString();
		
		try {
			File Obj = new File("D:\\Data\\BaseballTeam.txt");
			
			if(Obj.createNewFile()) {
				System.out.println("File created: " + Obj.getName());
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
		
		File file = new File("D:\\Data\\BaseballTeam.txt");
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file ,true)));
			
			MemberDao dao = new MemberDao();
			HumanDto[] book = new HumanDto[5];
			book = dao.getMemberBook();
			System.out.println(book);
			
			for (HumanDto humanDto : book) {
				System.out.println(humanDto);
				if(humanDto != null) {
					pw.println(humanDto);	
				}
				
			}
			
			
			
			pw.close();
			System.out.println("입력성공 !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}