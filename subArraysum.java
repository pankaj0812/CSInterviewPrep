   static long subarraySum(int[] arr) {
        long n = arr.length;
        long result = 0;
        if(n==1){
            return 1;
        }
        for(int i=0; i<n; i++){
            result+= (arr[i] * (i+1) * (n-i));
            //System.out.println(result);
        }
        
        return result;

    }
