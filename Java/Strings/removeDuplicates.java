// Removes duplicate characters from a string and returns a new string with all unique characters
String removeDuplicates(String str) {
	// Check for edge cases
	if(str == null) {
		return null;
	}
	if(str.length() < 2) {
		return str;
	}
	boolean[] seen = new boolean[128];
	StringBuilder sb = new StringBuilder(str.length());
	for(int i = 0; i < str.length(); i++) {
		int val = str.charAt(i);
		if(!seen[val]) {
			seen[val] = true;
			sb.append(val);
		}
	}
	return sb.toString();
}