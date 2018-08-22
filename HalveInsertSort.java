package sort;
/**
 *
 * @author  LiJing 
 * @date    2017年9月8日 上午8:41:54
 * @Version 1.0
 *
 */
public class HalveInsertSort {
	public static void main(String[] args) {
		int[] arr={7,6,5,4,3,2,1,1,0,7,6,5,8,2,1,4};
		HaInSo(arr);
		for(int p:arr){
			System.out.print(p+"  ");	
		}
	}
	
	/**
	 * 
	 * @Title: HaInSo
	 * @Description: 
	 * @param: @param arr   
	 * @return: void   
	 * @throws
	 */
	public static void HaInSo(int []arr){
		for(int i=1;i<arr.length;i++){
			int right=i-1;
			int left =0;
			while(right>=left){
				int mid=(right+left)/2;
				if(arr[i]<arr[mid]){
					right=mid-1;
				}else 
					left=mid+1;
			}
			int temp=arr[i];
			for(int j=i-1;j>=left;j--){
				arr[j+1]=arr[j];
			}
			arr[left]=temp;
		}
	 }	
}
