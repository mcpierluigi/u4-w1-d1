
public class PrimoMain {
	public static int moltiplica(int a, int b) {
		return a * b;
	}
		
	public static String concatena(String s, int n) {
        return s + n;
    }
	
	public static void main(String[] args) {
		
		int c = moltiplica(3 , 4);
		System.out.println(c);
		
		String frase = concatena("Ciao, sono Pier e ho ", 26);
		System.out.println(frase + " anni");
	}
}
