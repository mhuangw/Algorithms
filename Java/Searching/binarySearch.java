boolean binarySearch(int[] nums, int key) {
	int start = 0;
	int end = nums.length - 1;
	while(start <= end) {
		int mid = (start + end) / 2;
		if(nums[mid] == key) {
			return true;
		}
		if(nums[mid] < key) {
			start = mid + 1;
		}
		if(nums[mid] > key) {
			end = mid - 1;
		}
	}
	return false;
}