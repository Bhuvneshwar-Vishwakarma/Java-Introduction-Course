package interviewQuestions;

public class MergeArrayWOExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public void merge(int arr1[], int arr2[], int n, int m) {
        
        int p1=n-1,p2=0;
        while(p1>0&&p2<m){
            if(arr1[p1]>arr2[p2]){
                int temp=arr1[p1];
                arr1[p1]=arr2[p2];
                arr2[p2]=temp;
            }
            p1--;
            p2++;
        }
        
        // int i=n-1,j=0;
        // while(i>=0 && j<m) {
        //     if(arr1[i]>arr2[j])
        //     {
        //         int temp=arr1[i];
        //         arr1[i]=arr2[j];
        //         arr2[j]=temp;
        //     }
        //     i--;
        //     j++;
        // }
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
    }
    
}

