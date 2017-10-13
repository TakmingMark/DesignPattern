import java.util.ArrayList;

public class News implements Observable{

	private ArrayList<Observer> readerList=new ArrayList<Observer>();
	private boolean latestNews=true;
	
	public void setLatestNews(boolean latestNews) {
		this.latestNews=latestNews;
		notify(latestNews);
	}
	
	@Override
	public void register(Observer reader) {
		readerList.add(reader);
	}

	@Override
	public void unregister(Observer reader) {
		readerList.remove(reader);
	}

	@Override
	public void notify(boolean isLatestNews) {
		for(Observer reader:readerList) {
			reader.update(latestNews);
		}
	}

}
