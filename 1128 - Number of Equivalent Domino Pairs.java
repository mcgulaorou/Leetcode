class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < dominoes.length; i++){
            int value = Math.min(dominoes[i][0], dominoes[i][1])*10 + Math.max(dominoes[i][0], dominoes[i][1]);
            map.put(value, map.getOrDefault(value,0) + 1);
        }
        int pairCount = 0;
        for (int i : map.values()){
            pairCount += i * (i-1)/2;
        }
        return pairCount;
    }
}
