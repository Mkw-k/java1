package cls;

import Dto.memberDto;

public class manager {
	memberDto[] md = new memberDto[100];
	
	public void dataInput() {
		boolean b = true;
		
		while(true) {
			for (int j = 0; j < md.length; j++) {
				if(b == true) {
					if(md[j].getDate()==null) {
						md[j] = new memberDto();
					}
				}
			}
		}
	}
}
