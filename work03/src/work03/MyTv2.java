package work03;

import javax.xml.bind.ValidationEvent;

public class MyTv2 {
	boolean isPowerOn;
	int channel;
	int volumn;
	
	void setChannel(int ch) {
		channel = ch;
	}
	
	int getChannel() {
		return channel;
	}
	
	void setVolume(int vo) {
		volumn = vo;
	}
	
	int getVolume() {
		return volumn;
	}
	
	
}
