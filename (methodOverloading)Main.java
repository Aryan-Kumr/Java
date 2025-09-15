public class Main
{
    // method overloading : allows a class to have multiple methods with the same name but different parameter lists.
    // Note : different return type with same same signature of a method is not considered as method overloading
    // and they are not different.
    
    static int compare(int x, int y) {
        return (x > y ? x : y);
    }
    static float compare(float x, float y) {
        return (x > y ? x : y);
    } 
    
	public static void main(String[] args) {
	    int i;
	    float fl;
	    
	    i = compare(10, 20);
	    fl = compare(10f, 20f);
	    System.out.println(i);
	    System.out.println(fl);
	    
	    float n1 = 10, n2 = 20;
	    float res = compare(n1, n2);
	    System.out.println(res);
	}
}
