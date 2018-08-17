package structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();
		
		player.play("mp3", "show me your money.mp3");
		player.play("vlc", "can't you love me.vlc");
		player.play("mp4", "where are you.mp4");
		
		player.play("mfc", "I love you.mfc");
	}

}
