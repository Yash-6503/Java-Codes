//BLC class of MediaPlayerSystem -> MusicPlayer.java

package pkg.blc1;

public class MusicPlayer implements AdvancedmediaPlayer 
{
	String title;
	
	public MusicPlayer(String title) {
		if(title.equals("") || title.equals(" ")) {
			System.err.println("Error: Title is not be empty string.");
			System.exit(0);
		}else {
			this.title = title;
		}
	}
	
	@Override
	public void play() {
		System.out.println("Playing Music: "+title);
	}

	@Override
	public void stop() {
		System.out.println("Stopping Music: "+title);
	}

	@Override
	public void pause() {
		System.out.println("Pausing Music: "+title);
	}

}
