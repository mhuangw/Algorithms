# Checks if a string has all unique characters
def is_unique(str):
	if str is None:
		return True
	# String is not unique if length exceeds number of ASCII characters
	if len(str) > 128:
		return False
	# Dictionary to check occurrence of each ASCII character in the string
	chars = {}
	for char in str:
		if char in chars:
			return False
		chars[char] = True
	return True
