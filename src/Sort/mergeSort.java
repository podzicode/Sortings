package Sort;

public class mergeSort {

	public static void main(String[] args) {
		int [] x= {1,3,2,6,1,2};
		int n=x.length;
		int k=3;
		int result= mergeSort.kangaroo(n,k,x);
		System.out.println(result);
		
		// TODO Auto-generated method stub

	}
	static int kangaroo(int n, int k,int [] a) {
		int startingIndex=0;
        int m=2;
        int sum=0;
        int result=0;
        for(int i=0;i<n;i++){
             startingIndex=i;
            if(startingIndex==0){
                for(int j=1;j<n;j++){
                    sum=a[startingIndex]+a[j];
                    if((sum%k)==0){
                    	if(startingIndex<j)
                        result+=1;
                    }
                }
            }
            else{
                for(int x=0;x<i;x++){
                    sum=a[startingIndex]+a[x];
                    if((sum%k)==0){
                    	if(startingIndex<x)
                        result+=1;
                    }
                    
                }
                for(int y=i+1;y<n;y++){
                    sum=a[startingIndex]+a[y];
                    if((sum%k)==0){
                    	if(startingIndex<y)
                        result+=1;
                    }
                }
            }
            
        }
        return result;
        
	}

}
