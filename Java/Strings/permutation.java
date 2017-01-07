// 
boolean permutation(String first, String second) {
    if(first.length() != second.length()) {
      return false;
    }
    int[] charCount = new int[128];
    for(int i = 0; i < first.length(); i++) {
      int val = first.charAt(i);
      charCount[val]++;
    }
    for(int j = 0; j < second.length(); j++) {
      int val = second.charAt(j);
      charCount[val]--;
      if(charCount[val] < 0) {
        return false;
      }
    }
    return true;
  }