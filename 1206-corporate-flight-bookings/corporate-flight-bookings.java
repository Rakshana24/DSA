class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr=new int[n];
        Arrays.fill(arr,0);
        int k=bookings.length;
        for(int i=0;i<k;i++){
        
            arr[bookings[i][0]-1]+=bookings[i][2];
             if(bookings[i][1]>=n){
                continue;
            }
            arr[bookings[i][1]]-=bookings[i][2];
        }
        int sum=0;
        for(int i=0;i<n;i++){
          sum+=arr[i];
          arr[i]=sum;
        }
        return arr;
    }
}