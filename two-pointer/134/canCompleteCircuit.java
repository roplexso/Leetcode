class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalSurplus = 0;
        int currentTank = 0;
        int startIndex = 0;
        for(int i = 0; i < gas.length; i++){
            int netFuel = gas[i] - cost[i];
            totalSurplus += netFuel;
            currentTank += netFuel;
            if(currentTank < 0){
                startIndex = i + 1;
                currentTank = 0;
            }
        }
        return totalSurplus >= 0 ? startIndex : -1;
    }
}