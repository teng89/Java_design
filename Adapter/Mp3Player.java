package design.Adapter;

public class Mp3Player implements AdvancedPlayer{

	public void playAudio(String filePath) {
		// TODO Auto-generated method stub
		System.out.println("Mp3Player play the music");
	}
	
	public void playVideo(String filePath) {
		System.out.println("Mp3Player do nothing");
	}
}
