class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
      return false;
    }
    var s1 = new HashMap<Character, Integer>();
    var s2 = new HashMap<Character, Integer>();

    // System.out.println(s.toCharArray());

    for (char c: s.toCharArray()) {
      //s1.computeIfPresent(c, (k, oldValue) -> s1.put(k, ++oldValue));
      if (s1.containsKey(c)) {
        s1.put(c, s1.get(c) + 1);
      }
      s1.putIfAbsent(c, 1);
    }

    for (char c: t.toCharArray()) {
        if (s2.containsKey(c)) {
            s2.put(c, s2.get(c) + 1);
        }
      s2.putIfAbsent(c, 1);
    }

    for (char c: (s + s).toCharArray()) {
      if (!Objects.equals(s1.get(c), s2.get(c))) {
        return false;
      }
    }

    System.out.println(s1);

    return true;
    }
}
