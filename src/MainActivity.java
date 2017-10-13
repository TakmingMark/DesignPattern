
public class MainActivity {

	public static void main(String[] args) {
		
		News news = new News();
		
		Reader john = new Reader("john"); // �s�WŪ��
		Reader mary = new Reader("mary");
		Reader bill = new Reader("bill");
		
		// Observer(Reader)�q�\Observable(News)
		john.subscribe(news); //�q�\�s�D
		mary.subscribe(news);
		bill.subscribe(news);
		
		mary.unsubscribe();
		news.setLatestNews(true); // ���Observble(News)�����A

	}
}
