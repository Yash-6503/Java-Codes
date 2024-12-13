//BLC class of MediaPlayerSystem -> VideoPlayer.java

package pkg.blc1;

public class VideoPlayer implements AdvancedmediaPlayer  
{
	String title;
	
	public VideoPlayer(String title) {
		if(title.equals("") || title.equals(" ")) {
			System.err.println("Error: Title is not be empty string.");
			System.exit(0);
		}else {
			this.title = title;
		}
	}
	
	@Override
	public void play() {
		System.out.println("Playing Video: "+title);
	}

	@Override
	public void stop() {
		System.out.println("Stopping Video: "+title);
	}

	@Override
	public void pause() {
		System.out.println("Pausing Video: "+title);
	}
}
