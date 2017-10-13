
public class Reader implements Observer{

	private String name;
	private Observable news;
	
	public Reader(String name) {
		this.name=name;
	}
	@Override
	public void subscribe(Observable news) {
		this.news=news;
		news.register(this);
	}

	@Override
	public void unsubscribe() {
		news.unregister(this);
	}

	@Override
	public void update(boolean isLastestNews) {
		read(isLastestNews);
	}
	
	public void read(boolean latestNews) {
		if(latestNews)
			System.out.println(name+"read latest News");
		else
			System.out.println(name+"read old News");
	}

}
