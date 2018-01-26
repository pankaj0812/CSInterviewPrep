public class Solution{
   
   static int CeilIndex(int A[], int l, int r, int key)
    {
        while (r - l > 1)
        {
            int m = l + (r - l)/2;
            if (A[m]>=key)
                r = m;
            else
                l = m;
        }
 
        return r;
    }

    static int findLIS(int[] s) {
        int size = s.length;
        int len; // always points empty slot
         int[] tailTable   = new int[size];

        tailTable[0] = s[0];
        len = 1;
        for (int i = 1; i < size; i++)
        {
            if (s[i] < tailTable[0])
                // new smallest value
                tailTable[0] = s[i];
 
            else if (s[i] > tailTable[len-1])
                // A[i] wants to extend largest subsequence
                tailTable[len++] = s[i];
 
            else
                // A[i] wants to be current end candidate of an existing
                // subsequence. It will replace ceil value in tailTable
                tailTable[CeilIndex(tailTable, -1, len-1, s[i])] = s[i];
        }
 
        return len;
    }


    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _s_size = Integer.parseInt(in.nextLine());
        int[] _s = new int[_s_size];
        int _s_item;
        for(int _s_i = 0; _s_i < _s_size; _s_i++) {
            _s_item = Integer.parseInt(in.nextLine());
            _s[_s_i] = _s_item;
        }
        
        res = findLIS(_s);
        System.out.println(res);
        
    }
}
