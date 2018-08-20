package message;
/**
 * Broadcasts a message to multiple subscribers.
 */
public class Sequencer implements IPublisher, ISubscriber
{	
	private ISubscriber[] _subArray;
	private int _location=0;
	private int _i=0;
	private boolean _checkEnd;
	@Override
	/**
	 * this method will call the notify method on the next ISubscriber in the array of subscriber.
	 * when the end has been reached it will go back to 0
	 * the parameter is an message instance used to call notify.
	 */
	public void notify(Message msg) 
	{		
		_checkEnd=(_i==_subArray.length-1);
		if (_checkEnd==true)
		{
			if(_subArray[_i]==null)
				{
					_i=0;
				}
			else
				{
					_subArray[_i].notify(msg);
					_i=0;
				}
				
		}
		else
		{
			if(_subArray[_i]==null)
			{
				_i++;
			}
			else
			{
				_subArray[_i].notify(msg);
				_i++;
			}
			
		}
		
	}
				
	/**
	 * this method do the exact same thing as in Broadcaster.subscribe
	 */
	@Override
	public void subscribe(ISubscriber subscriber)
	{	
		if (_location<_subArray.length)
		{
			_subArray[_location]=subscriber;
			_location++;		
		}
	}
	/**
	 * this method do the exact same thing as in Broadcaster.unsubscribe
	 */
	@Override
	public void unsubscribe(ISubscriber subscriber)
	{
		
	}
	/**
	 * Creates an instance of a Broadcaster that can hold up to some number of
	 * subscribers.
	 * @param numSubscribers The maximum number of subscribers that this
	 * Broadcaster can hold.
	 */
	public Sequencer(int maxSub)
	{
		this. _subArray = new ISubscriber[maxSub];
		 
		
		
	}

}
