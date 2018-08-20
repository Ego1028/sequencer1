package model;

import message.Broadcaster;

/**
 * with this class, we can creat Chord instance by giving it several sound instances
 * Then it creates one Soundplayer for each sound.
 * @author Ruolin
 *
 */
public class Chord extends Broadcaster
{	
	/**
	 * Everytime this class's notify method is called, it will notify all of those Soundplayers,
	 * each of which plays a sound.
	 * @param s
	 */
	public Chord(Sound[] s)
	{
		super(s.length);
		for(int i=0;i<=s.length-1;i++)
		{
			SoundPlayer sp = new SoundPlayer(s[i]);
			this.subscribe(sp);
			
		}
		
	}

}
