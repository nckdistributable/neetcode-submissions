impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
      let mut seen: HashMap<i32, usize> = HashMap::default();
      for (index, el) in nums.iter().enumerate() {
        let res = &(target - el);
        if seen.contains_key(res) {
          let s = *seen.get(res).unwrap();
          return vec![s as i32 ,index as i32]
        }
        seen.insert(*el, index);
      }
      Vec::new()
    }
}
