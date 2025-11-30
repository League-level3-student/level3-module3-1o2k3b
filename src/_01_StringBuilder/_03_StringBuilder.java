package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
    	 StringBuilder build = new StringBuilder();
    	 build.append(str);
    	 for(int i = 0; i<characters.length; i++) {
    		 build.append(characters[i]);
    	 }
        return build.toString();
    }
    
    public static String reverse(String str) {
    	 StringBuilder build = new StringBuilder();
    	 for(int i = str.length()-1; i>=0; i--) {
    		 build.append(str.charAt(i));
    	 }
        return build.toString();
        
    }
    
    public static String insert(String str, int index, char newChar) {
    	 StringBuilder build = new StringBuilder();
    	 build.append(str);
    	 build.insert(index, newChar);
        return build.toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	 StringBuilder build = new StringBuilder();
    	 build.append(str);
    	 build.delete(startIndex, endIndex);
        return build.toString();
    }
}