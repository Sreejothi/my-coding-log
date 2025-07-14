public class Duplicate2 {
	public static void main(String[]args) {
		int[]arr= {10,20,40,10,20};
		boolean[]visited= new boolean[arr.length];
		boolean found=false;
		System.out.println("Duplicate found");
		for(int i=0;i<arr.length;i++) {
			if(visited[i])continue;
			boolean isDuplicate=false;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					isDuplicate=true;
				
				}
			}
			if(isDuplicate) {
				System.out.println(arr[i]+"");
				found=true;
			}
		}
		if(!found) {
			System.out.println("no duplicates");
		}
	}

}
