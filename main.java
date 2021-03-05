// a little better than brute force
// the brackets are not lined up well
// l am tired, l slept less than 5 hours for 2 days in a row.
// The thing is l just woke up naturally, god sake.

class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
    
    int i=0;
        int j=height.length-1;
  
  while(i<j){

         maxarea=Math.max(maxarea,(Math.min(height[i],height[j]))*(j-i));
      
      if(height[i]>height[j]){
          j--;
      }
      else{
         i++;
    }
      
      
    }
       return maxarea;
  }



  }
    
