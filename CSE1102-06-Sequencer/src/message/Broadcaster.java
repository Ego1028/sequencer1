package message;
/**
 * Broadcasts a message to multiple subscribers.
 */
public class Broadcaster implements IPublisher, ISubscriber
{	
	private ISubscriber[] _subArray;
	private int _location=0;
	@Override
	/**
	 * this method will notify all the subscribers
	 * parameter is an Message instance.
	 */
	public void notify(Message msg) 
	{		
		for(int i =0; i <= _subArray.length-1;i++)
		{ 		
			if (_subArray[i]!=null)
			{
				_subArray[i].notify(msg);
			}
			
		}
	}
	@Override
	/**
	 * this method will let subscribers subscribe to the broadcaster.
	 * Parameter is the subscriber instance.
	 */
	public void subscribe(ISubscriber subscriber)
	{	
		if (_location<_subArray.length)
		{
			_subArray[_location]=subscriber;
			_location++;		
		}
	}
	/**
	 * this method allow a subscriber to unsubscribe
	 * Parameter is subscriber itself.
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
	public Broadcaster(int maxSub)
	{
		this. _subArray = new ISubscriber[maxSub];
		 
		
		
	}

}
