package design.Adapter;

public class Mp4Player implements AdvancedPlayer{

	public void playAudio(String filePath) {
		// TODO Auto-generated method stub
		System.out.println("Mp4Player do nothing");
	}
	
	public void playVideo(String filePath) {
		// TODO Auto-generated method stub
		System.out.println("Mp4Player play the audio");
	}
}
