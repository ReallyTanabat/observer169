public class UAEScore implements MyObserver {
    @Override
    public void update(Source o) {
        System.out.println(
	 "Your Entered UAE Scores :  " + 
                ((HeadQuater)o).getSomeData());
    }
}