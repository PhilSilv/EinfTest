
public class Codingbat {
	static public boolean makeBricks(int small, int big, int goal) {
		  if ( goal == 0 ) return true;
		  
		  big += small/5;
		  
		  if ( goal/5 > big ) return false;
		  if ( goal%5 > small ) return false;
		  
		  return true;
		  
		}

}
