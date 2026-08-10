class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        // Separate negative and positive numbers
        for(int i:nums){
            if(i<0){
                neg.add(i);
            }
            else{
                pos.add(i);
            }
        }
        // Case 1:No negative number
        if(neg.size()==0){
            for(int j=0;j<pos.size();j++){
                pos.set(j,pos.get(j)*pos.get(j));
            }
            int[] arr1=new int[pos.size()];
            for(int idx=0;idx<pos.size();idx++){
                arr1[idx]=pos.get(idx);
            }
            return arr1;
        }
        // Case 2:No positive number
        if(pos.size()==0){
            for(int k=0;k<neg.size();k++){
                neg.set(k,neg.get(k)*neg.get(k));
            }
            Collections.reverse(neg);
            int[] arr2=new int[neg.size()];
            for(int id=0;id<neg.size();id++){
                arr2[id]=neg.get(id);
            }
            return arr2;
        }
        // Case 3: Both positive and negative
        int j=0,k=0,id=0;
        int n1=neg.size();
        int n2=pos.size();
        int[] res=new int[n1+n2];
         // Squares negative and reverse them
        for( k=0;k<neg.size();k++){
                neg.set(k,neg.get(k)*neg.get(k));
            }
            Collections.reverse(neg);

            // Squares positives
             for( j=0;j<pos.size();j++){
                pos.set(j,pos.get(j)*pos.get(j));
            }

            // Merge two sorted array

            j=0;
            k=0;
            while(j<n1 && k<n2){
                if(neg.get(j)<=pos.get(k)){
                    res[id++]=neg.get(j);
                    j++;
                }
                else{
                    res[id++]=pos.get(k);
                    k++;
                }
            }
            while(j<n1){
                res[id++]=neg.get(j);
                j++;
            }
            while(k<n2){
                res[id++]=pos.get(k);
                k++;
            }
            return res;
    }
}