package structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();
		
		player.play("mp3", "���糱ˮ.mp3");
		player.play("vlc", "û������.vlc");
		player.play("mp4", "��������.mp4");
		
		player.play("mfc", "�����ļ�.mfc");
	}

}
