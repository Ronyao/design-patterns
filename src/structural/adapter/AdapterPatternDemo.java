package structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer player = new AudioPlayer();
		
		player.play("mp3", "爱如潮水.mp3");
		player.play("vlc", "没见过你.vlc");
		player.play("mp4", "动物世界.mp4");
		
		player.play("mfc", "测试文件.mfc");
	}

}
