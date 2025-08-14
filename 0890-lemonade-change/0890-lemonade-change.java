class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] < 5) return false;
        int[] avail = {0,0};
		
		for(int i = 0; i < bills.length; i++) {
			if(bills[i] == 5) {
				avail[0] = avail[0] + 1;
			}
			else if (bills[i] == 10) {
				if(avail[0] > 0) {
                    avail[0] = avail[0] - 1;
				    avail[1] = avail[1] + 1;
                }else{
                    return false;
                }
			}
			else {
				if(avail[1] > 0 && avail[0] > 0) {
					avail[1] = avail[1] - 1;
					avail[0] = avail[0] - 1;
					continue;
				}
				if(avail[0] > 2) {
					avail[0] = avail[0] - 3;
					continue;
				}
				return false;
			}
        }
        return true;
    }
}