""" Returns the first unique (non-recurring) character in a string
	If no unique characters are present, returns None
"""
def first_unique(str):
	if str is None:
		return None
	charCount = {}
	for x in str: 
		if x in charCount:
			charCount[x] += 1
		else:
			charCount[x] = 1
	for y in str:
		if charCount[y] == 1:
			return y
	return None
