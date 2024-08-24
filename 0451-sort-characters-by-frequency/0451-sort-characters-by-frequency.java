class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(Character a:s.toCharArray()){
            map.put(a,map.getOrDefault(a, 0)+1);
        }
        String s1=map.entrySet().stream().sorted(
                (o1, o2) -> o2.getValue()-o1.getValue()).
                map(x->x.getKey().toString().repeat(x.getValue())).
                collect(Collectors.joining());
        return s1;
    }
}