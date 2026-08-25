class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1; i<= numRows; i++) {
            result.add(generateList(i));
        }
        return result;
    }
    public static List<Integer> generateList(int n) {
        List<Integer> ros = new ArrayList<>();
        ros.add(1);
        for(int i=1; i < n ; i++) {
            ros.add((ros.get(i-1) * (n-i))/i);
        }
        return ros;
    }
}