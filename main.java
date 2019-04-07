package source;
import java.util.Random;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Igel i = new Igel(15, 20);
//		Igel j = new Igel(125, 20);
//		Igel k = new Igel(153, 20);
		
//
//		a.appendLast(i);
//		a.appendLast(j);
//		a.appendLast(k);
//		a.get(1);
//		a.get(2);
//		a.get(3);

//		System.out.println(a.toString());
		
		
//		
//		int dbSize = 1000000;
//		DBFeldFix a = new DBFeldFix(dbSize+1);
//		for(int f = 0; f<=dbSize;f++) {
//			Igel i = new Igel(randomInRange(10,45), randomInRange(20,2000));
//			a.appendLast(i);
//		}

	}

	private static int randomInRange(int i, int j) {
		Random rand = new Random();
		int r = rand.nextInt((j - i) + 1) + i;
		return r;
	}

}
