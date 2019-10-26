package design.Adapter;

public class AdapterMediaPlayer implements MediaPlayer{
	
	public AdvancedPlayer player;
	
	public AdapterMediaPlayer(String type) {
		// TODO Auto-generated constructor stub
		if("MP3".equalsIgnoreCase(type)) {
			player = new Mp3Player();
		} else if("MP4".equalsIgnoreCase(type)) {
			player = new Mp4Player();
		} else {
			player = new AdvancedPlayer() {
				
				public void playVideo(String filePath) {
					// TODO Auto-generated method stub
					System.out.println("AdvancedPlayer do nothing");
				}
				
				public void playAudio(String filePath) {
					// TODO Auto-generated method stub
					System.out.println("AdvancedPlayer do nothing");
				}
			};
		}
		
	}
	
	
	public void play(String type, String filePath) {
		// TODO Auto-generated method stub
		if("Mp3".equalsIgnoreCase(type)) {
			player.playAudio(filePath);
		} else if("Mp4".equalsIgnoreCase(type)) {
			player.playVideo(filePath);
		}
	}

}
