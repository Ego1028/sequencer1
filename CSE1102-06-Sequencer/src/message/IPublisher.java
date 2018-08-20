package message;

/**
 * This is the Ipublisher interface, every publisher must implements these methods
 * @author Ruolin
 *
 */
public interface IPublisher
{
	public void subscribe(ISubscriber subscriber);
	public void unsubscribe(ISubscriber subscriber);

}
