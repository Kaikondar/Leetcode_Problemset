/* 
You are given an array nums consisting of positive integers.
 Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
*/
import java.util.*;

class MostFrequency{

      public static void main(String[] args){
          int[] nums = {1,2,3,2,1,3,4};
          int ans = mostFreq(nums);
          System.out.println(ans);
      }

      static int mostFreq(int[] nums){
            Map<Integer, Integer> map = new HashMap<>();
            for(int i : nums){
                  map.put(i, map.getOrDefault(i,0)+1);
            }
            List<Integer> list = new ArrayList<>(map.values());
            Collections.sort(list);
            int val = list.get(list.size()-1);
            int ans = val;
            for(int i=list.size()-2;i>=0;i--){
                  if(list.get(i) == val)
                     ans+=val;
            }
            return ans;
      }
}
