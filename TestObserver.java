package observer;
import java.util.*;


public class TestObserver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your Thai Score : ");
        int left = in.nextInt();
        System.out.print("Your UAE Score : ");
        int Right = in.nextInt();
	ThaiScore obj1 = new ThaiScore();
	UAEScore obj2 = new UAEScore();
	HeadQuater obj = new HeadQuater();              
	obj.register(obj1);              
	obj.register(obj2);              
	obj.setSomeData(left);
    obj.setSomeData(Ritht);
    }
}