static int[] countOperationsToK(long[] kValues) {

        final int[] intArray = new int[kValues.length];
        
        for (int i=0; i<intArray.length; ++i) {
           
           //  intArray[i] = (int) kValues[i];
            long n = kValues[i];
           // System.out.println(" element : " + n);
            int counter = 0;
            if(n<Math.pow(10, 16)){
            while(n!=0){
                if(n>2 && n%2 == 0){
                    n /=2;
                    
                }else{
                    n--;
                }
                counter++;
            }
                intArray[i] = counter;

            }else
                break;
            
            
            
        }
        
        return intArray;

    }
