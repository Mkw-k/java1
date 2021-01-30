package cls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import dao.MemberDao;

public class DataCls extends MemberDao{
	
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
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
			pw.println(getMemberBook().toString());
			pw.close();
			System.out.println("입력성공 !");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}