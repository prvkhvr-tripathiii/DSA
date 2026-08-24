class NumArray {
    private int n;
    private int[] tree;

    public NumArray(int[] nums) {
        // if nums is empty
        if (nums == null || nums.length == 0){
            return;
        }
        this.n = nums.length;
        this.tree = new int[4 * n];     // to avoid ArrayOutOfBoundException
        buildTree (nums, 1, 0, n-1);    // to build tree
    }

    private void buildTree(int[] arr, int node, int start, int end) {
        if (start == end) {
            // if arr has only one element, root of tree will have its value
            tree[node] = arr[start];
            return;
        }

        int mid = start + (end - start) / 2;
        buildTree (arr, 2 * node, start, mid);
        buildTree (arr, 2 * node + 1, mid + 1, end);

        tree[node] = tree[2 * node] + tree[2 * node + 1];     // Merge Step
    }
    
    // Wrapper update Function
    public void update(int index, int val) {
        update (1, 0, n-1, index, val);
    }

    // Internal update function
    private void update(int node, int start, int end, int idx, int val) {
        if (start == end) { 
            // found the target leaf node
            tree[node] = val;
            return;
        }
        
        int mid = start + (end - start) / 2;
        if (mid >= idx) {     // if idx lies between 0 to mid
            update (2 * node, start, mid, idx, val);
        }
        else {                // if idx lies between mid + 1 to end
            update (2 * node + 1, mid + 1, end, idx, val);
        }

        // Recalculation after updation
        tree[node] = tree[2 * node] + tree[2 * node + 1];
    }
    
    // Wrapper Query Function
    public int sumRange(int left, int right) {
        return query (1, 0, n-1, left, right);
    }

    // Internal Query function
    private int query(int node, int start, int end, int l, int r) {

        // Range is completely outside the node bound
        if (r < start || l > end) {
            return 0;
        }

        // Range completely covers the node bounds
        if (l <= start && r >= end) {
            return tree[node];
        }

        // Range partially overlaps with the node bounds
        int mid = start + (end - start) / 2;
        int leftSum = query (2 * node, start, mid, l, r);
        int rightSum = query (2 * node + 1, mid + 1, end, l, r);
        return leftSum + rightSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */