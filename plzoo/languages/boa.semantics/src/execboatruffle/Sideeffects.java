package execboatruffle;

public class Sideeffects {
	
	public static boolean PRINT = true;
	
	public static StringBuilder SB = new StringBuilder();
	
	public static void println(Object obj) {
		if(PRINT) {
			System.out.println(obj);
		} else {
			SB.append(obj);
			SB.append(System.lineSeparator());
		}
	}
}
