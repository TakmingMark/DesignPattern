
public interface Observer {
public void subscribe(Observable news);
public void unsubscribe();
public void update(boolean isLastestNews);
}
