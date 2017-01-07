# Checks if two strings are permutations (anagrams) of each other
def permutation(first, second):
  # Length must be equal for strings to be permutations
  if len(first) != len(second):
    return False
  # Use dictionary to count character occurrence in each string
  charCount = {}
  for x in first:
    if x in charCount:
      charCount[x] += 1
    else:
      charCount[x] = 1
  # Compare character count in both strings
  for y in second:
    if y not in charCount:
      return False
    charCount[y] -= 1
    if charCount[y] < 0:
      return False
  return True