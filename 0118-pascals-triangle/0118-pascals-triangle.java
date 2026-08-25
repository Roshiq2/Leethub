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
        int res =1;
        ros.add(res);
        for(int i=1; i < n ; i++) {
            res *= (n-i);
            res /= i;
            ros.add(res);
        }
        return ros;
    }
}