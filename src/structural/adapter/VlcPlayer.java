package structural.adapter;

public class VlcPlayer implements AdvanceMusicPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vcl file. Name: "+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		//nothing
	}
	
}
