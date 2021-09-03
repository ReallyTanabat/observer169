package observer;
public class ThaiScore implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println(
	 "Your Entered Thai Scores : " 
                + ((HeadQuater)o).getSomeData());
    }
}