// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
// [4,12,14,1,5,4]
// 4
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pa) {
        List<Pair> pairs = new ArrayList(pa);
        List<List<Pair>> res = new ArrayList<>();
        if (pairs.isEmpty()) {
            return res;

        }
        res.add(new ArrayList<>(pairs));
        for (int i = 1; i < pairs.size(); i++) {
            var current = pairs.get(i);
            var j = i;
            while (j > 0 && pairs.get(j - 1).key > current.key) {
                pairs.set(j, pairs.get(j - 1));
                j--;
            }
            pairs.set(j, current);
            res.add(new ArrayList<>(pairs));
        }
        return res;
    }
}
