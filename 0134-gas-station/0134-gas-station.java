
// WELCOME TO MY PROFILE

/* In this Problem we have to find a starting position, if we start from that position we should travel to all the Gas Station without Emptying the tank*/

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;

//      Firstly we check if the totalgas is greater than totalCost if not we cannot travel to all the station

        for(int i = 0; i < gas.length; i++)
        {
            totalGas = totalGas + gas[i];
            totalCost = totalCost + cost[i];
        }

        if(totalCost > totalGas) return -1;

        int startIndex = 0, currentGas = 0;

        for(int i = 0; i < gas.length; i++)
        {

            // then we find at each station if the currentgas is positive or not if it is negative we cannot move to next station

            currentGas += gas[i] - cost[i];

            if(currentGas < 0)
            {
                startIndex = i + 1;
                currentGas = 0;
            }
        }
        return startIndex;
    }
}