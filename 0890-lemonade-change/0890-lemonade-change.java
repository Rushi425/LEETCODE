class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } 
            else if (bill == 10) {
                if (five-- == 0) return false;
                ten++;
            } 
            else { 
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } 
                else if (five >= 3) {
                    five -= 3;
                } 
                else {
                    return false;
                }
            }
        }
        return true;
    }
}

        // if(bills[0] < 5) return false;
        // int[] avail = {0,0};
		// for(int i = 0; i < bills.length; i++) {
		// 	if(bills[i] == 5) {
		// 		avail[0] = avail[0] + 1;
		// 	}
		// 	else if (bills[i] == 10) {
		// 		if(avail[0] > 0) {
        //             avail[0] = avail[0] - 1;
		// 		    avail[1] = avail[1] + 1;
        //         }else{
        //             return false;
        //         }
		// 	}
		// 	else {
		// 		if(avail[1] > 0 && avail[0] > 0) {
		// 			avail[1] = avail[1] - 1;
		// 			avail[0] = avail[0] - 1;
		// 			continue;
		// 		}
		// 		if(avail[0] > 2) {
		// 			avail[0] = avail[0] - 3;
		// 			continue;
		// 		}
		// 		return false;
		// 	}
        // }
        // return true;