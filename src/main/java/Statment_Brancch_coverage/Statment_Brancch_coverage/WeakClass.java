package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	
	public static int weakMethod1(int a, int b) {
        if ((a > 10) || (b == 0)) {
            return a/b;
        } else {
            return  a;
        }
    }
	public static int weakMethod2(int a, int b) {
		if(a<10) {
			if (b<1) {
	            return a/b;
	        }
			return a/b;
		}
		if(a>10) {
			if (b == 5) {
				b +=1;
				a +=1;
	        }
			return a/b;
		}
		return  a / b;
    }
	 public static int weakMethod3(int a, int b) {
	        if (a >= 5) {
	        	//*does nothing but the branch is not reached
	        }
	        if (a <= 5) {
	        	//*does nothing but the branch is not reached
	        }
	        return (a/(b)); // will be executed anyway even if the branches didnt get reached.
	 }
	 
	 public static int weakMethod4(int a, int b) {
	        if(a > 10) {
	        	return a/(b);
	        }
	        if(a < 10) {
	        	return a/(b);
	        }
	        return a/(b);
	    }

}