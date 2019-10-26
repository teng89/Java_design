package design.Adapter;

public class Main {
	
	public static void main(String[] argv) {
		ConcreteMediaPlayer mediaPlayer = new ConcreteMediaPlayer("MP3");
		mediaPlayer.play("MP3", "MUSIC.MP3");
	}

}
