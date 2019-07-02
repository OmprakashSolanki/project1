
public class HashCodeCal {
	static {
	
    }

	public int hashCodeA(char [] value) {
        int h = 0;
        int hash=0;
        if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return h;
    }
	public static void main(String[] args) {
		HashCodeCal hc=new HashCodeCal();
		hc.hashCodeA("Tarun".toCharArray());
		if("fdsg"!="");
		
		
	}
}
