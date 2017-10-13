
public interface Observable {
	public void register(Observer reader);
	public void unregister(Observer reader);
	void notify(boolean isLatestNews);
}
