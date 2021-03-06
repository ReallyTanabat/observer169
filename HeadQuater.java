import java.util.ArrayList;
public class HeadQuater implements Source {
    private final ArrayList<MyObserver> list;
    private int someData;

    public HeadQuater() {
        this.list = new ArrayList<MyObserver>();
    }
    public void setSomeData(int aData) {
	someData = aData;
	notifyObservers();
    }
    public int getSomeData() {
	return someData;
    }
    @Override
    public void register (MyObserver observer) {
        list.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	}
    }
}