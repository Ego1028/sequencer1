package model;

import message.ISubscriber;
import message.Message;
/**
 * The SoundPlayer will plays a sound when it receives a notification.
 * @author Ruolin
 *
 */

public class SoundPlayer implements ISubscriber
{	
	Sound _sound;

	@Override
	/**
	 * this method plays the sound
	 * parameter is msg
	 */
	public void notify(Message msg)
	{
		_sound.play();		
	}
	/**
	 * this constructor create a new Sound instance using its parameter
	 * @param s
	 */
	public SoundPlayer(String s)
	{
		_sound=new Sound(s);
		}
	/**
	 * this constructor stores the sound in the member variable.
	 * @param s
	 */
	public SoundPlayer(Sound s)
	{
		_sound=s;
		
	}

}
