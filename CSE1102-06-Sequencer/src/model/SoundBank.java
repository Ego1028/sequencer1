package model;

/**
 * This class will store Sound instances therefore gives new Chord instances.
 * And they play sounds.
 * @author Ruolin
 *
 */
public class SoundBank 
{	
	Sound[] sa;
	/**
	 * this constructor stores the Sound array into member variable
	 * @param s
	 */
	public SoundBank(Sound[] s)
	{
		 sa= s;
	}
	/**
	 * this method returns a Chord based on boolean array
	 * @param soundFlags
	 * @return
	 */
	public Chord chord(boolean[] soundFlags)
	{	
		{
			int numSounds=0;
			int arrloc[]=new int [soundFlags.length];
			for (int i=0;i<soundFlags.length;i++)
			{
				if (soundFlags[i]==true)
				{
					arrloc[numSounds]=i;
					numSounds++;
					
					
				}
			}
			Sound soundarr[]=new Sound[numSounds];
			for(int i=0;i<soundarr.length;i++)
			{
				soundarr[i]=sa[arrloc[i]];
			}
			Chord c=new Chord(soundarr);
			return c;
			
		}		
	}
	/**
	 * this method returns a Chord based on an int array
	 * @param soundNums
	 * @return
	 */
	public Chord chord(int[] soundNums)
	{	
		int l =soundNums.length;
		Sound soundarr[]=new Sound[l];
		for(int i=0;i<l;i++)
		{
			soundarr[i]=sa[soundNums[i]];
		}
		Chord c=new Chord(soundarr);
		return c;
	}
}


