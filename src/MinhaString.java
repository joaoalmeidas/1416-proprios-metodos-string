
public class MinhaString {
	
	private String string;

	public MinhaString(String string) {
		this.string = string;
	}
	
	public int indexOf(char c) {
		
		for(int i = 0; i < string.length(); i++) {
			
			if(string.charAt(i) == c) {
				
				return i;
				
			}
			
		}
		
		return -1;
	}
	
	public int lastIndexOf(char c) {
		
		for(int i = string.length() - 1; i >= 0; i--) {
			
			if(string.charAt(i) == c) {
				
				return i;
				
			}
			
		}
		
		return -1;
	}
	
	@Override
	public String toString() {
		return string;
	}
	
}
