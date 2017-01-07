def binary_search(nums, key):
	start = 0
	end = nums.length - 1
	while start <= end:
		mid = (start + end) / 2
		if nums[mid] == key:
			return True
		if nums[mid] < key:
			start = mid + 1
		if nums[mid] > key:
			end = mid - 1
	return False