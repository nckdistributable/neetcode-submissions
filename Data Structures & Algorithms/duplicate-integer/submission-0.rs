impl Solution {
    pub fn has_duplicate(nums: Vec<i32>) -> bool {
        let mut map = HashSet::new();
        for i in nums {
            if !map.insert(i) {
                return true;
            }
        }
        false
    }
}
