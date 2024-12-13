//ELC (main) class of MediaPlayer, AdvancedmediaPlayer, VideoPlayer, MusicPlayer -> MediaPlayerSystem.java

/*
Program to Design a Software System for a Media Player
*/

package pkg.blc1;

public class MediaPlayerSystem 
{

	public static void main(String[] args) 
	{
		MusicPlayer music = new MusicPlayer("Life");
		music.play();
		music.pause();
		music.stop();
		
		System.out.println();
		
		VideoPlayer video = new VideoPlayer("Movie");
		video.play();
		video.pause();
		video.stop();
	}

}

/*
Song is Playing....
Playing song is Paused..
Playing song is Stopped..

Video is Playing....
Playing Video is Paused..
Playing Video is Stopped..
*/

/*
Playing Music: Life
Pausing Music: Life
Stopping Music: Life

Error: Title is not be empty string.
*/