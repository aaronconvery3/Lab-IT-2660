class Lab1 {
    public int increment(int num) {
        return ++num;
    }

    // max of 2 integers
    public int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    // min of 2 integers
    public int min(int a, int b) {
        if (a < b) return a;
        else return b;
    }

    // sum
    public int sum(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return total;
    }

    // average
    public double average(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        return (double) total / nums.length;
    }

    // max of array
    public int max(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    // min of array
    public int min(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }
}