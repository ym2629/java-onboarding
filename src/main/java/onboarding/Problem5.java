package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        return solve(money);
    }
    static List<Integer> solve(int money){
    	int[] unit = {50000,10000,5000,1000,500,100,50,10,1};
    	List<Integer> wallet = new ArrayList<>();
    	
    	for(int i = 0; i < unit.length; i++) {
    		int count = money/unit[i];
    		wallet.add(count);
    		money -= unit[i]*(count);
    	}
    	
    	return wallet;	
    }
}
