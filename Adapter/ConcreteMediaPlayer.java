package design.Adapter;

public class ConcreteMediaPlayer implements MediaPlayer {
	
	AdapterMediaPlayer adapter;
	
	public ConcreteMediaPlayer(String type) {
		// TODO Auto-generated constructor stub
		adapter = new AdapterMediaPlayer(type);
	}
	
	public void play(String type, String filePath) {
		// TODO Auto-generated method stub
		adapter.play(type, filePath);
	}

}
