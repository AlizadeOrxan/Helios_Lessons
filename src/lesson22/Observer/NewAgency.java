package lesson22.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewAgency {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Əsas metod
    public void setNews(String news) {
        this.latestNews = news;
        notifySubscribers(); // Bütün abunəçiləri xəbərdar et
    }

    private void notifySubscribers() {
        for (Subscriber sub : subscribers) {
            sub.update(latestNews);
        }
    }
}
