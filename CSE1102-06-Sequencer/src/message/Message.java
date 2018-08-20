package message;

/**
 * This is the Message class, it will be imported by some classes
 * @author Ruolin
 *
 */
public class Message
{
	private IPublisher _publisher;
	public Message(IPublisher publisher)
	 {
	 _publisher = publisher;
	 }
	 public IPublisher getPublisher()
	 {
	 return _publisher;
	 }

}
