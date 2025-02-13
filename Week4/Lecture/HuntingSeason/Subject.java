package Week4.Lecture.HuntingSeason;

public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);
}
