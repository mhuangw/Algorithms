// Checks if a string has all unique characters

static boolean isUnique(String str) {
	if(str == null) {
		return null;
	}
	// String is not unique if length exceeds maximum ASCII count
	if(str.length() > 128) {
		return false;
	}
	boolean[] chars = new boolean[128];
	for(int i = 0; i < str.length(); i++) {
		int val = str.charAt(i);
		if(chars[val]) {
			return false;
		}
		chars[va] = true;
	}
	return true;
}
