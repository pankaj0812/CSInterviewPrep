*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int sum = 0;
        int max_len = 0 ;
        for (int i = 0 ; i<arr.length; i++){
          //  System.out.println("sum"+sum+" len" + max_len);
            sum +=arr[i];
            if(arr[i]==0 && max_len ==0)
                max_len = 1;
            if(sum==0) max_len = i+1;
            
            Integer record = hm.get(sum);
            if(record!=null){
                max_len = Math.max(max_len, i-record);
            }else{
                hm.put(sum, i);
            }
        }
        return max_len;
    }
}
