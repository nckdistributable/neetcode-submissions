impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
    if s.len() < t.len() {
        return false;
    }

    let mut array = [0; 26];

    for n in s.bytes(){
        array[(n - b'a') as usize] += 1;
    }
    for n in t.bytes() {
        array[(n - b'a') as usize] -= 1;
    }

    array.iter().all(|&e| e == 0)
    }
}
