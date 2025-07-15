public class LargestandSecond {
	public static void main(String[]args) {
		int[]arr= {10,20,40,80,50};
		int first=Integer.MAX_VALUE;
	    int second=Integer.MAX_VALUE;
	    for(int i=0;i<arr.length;i++) {
	    	int num=arr[i];
	    	if(num<first) {
	    		second=first;
	    		first=num;
	    	}
	    	else if(num<second&&num!=first) {
	    		second=num;
	    	}
	    }
	   
	    System.out.println(first);
	    System.out.println(second);

}
}
