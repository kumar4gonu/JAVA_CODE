package com.gonu.list;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoArrayIsEqual {
    public static void main(String[] args) {
      long A[]=  {16, 1, 2, 14, 13, 17, 1};
      long B[] ={14, 1, 16, 2, 13, 2 ,17};
      boolean val = checkEqual(A,B, A.length);
        System.out.println(val);
    }

    public static boolean checkEqual(long A[], long B[], int n){

        if(A.length != B.length)
            return false;
        Map<Long, Long> mapa = new HashMap<>();
        Map<Long, Long> mapb = new HashMap<>();
        long v = 1;
        for(int i=0;i<n;i++){
            if(mapa.containsKey(A[i])){
                mapa.put(A[i], mapa.get(A[i]) + 1);
            }else{
               mapa.put(A[i],v);
            }

            if(mapb.containsKey(B[i])){
                mapb.put(B[i], mapb.get(B[i]) + 1);
            }else{
                mapb.put(B[i],v);
            }

        }
        if(mapa.size() != mapb.size())
            return false;

      for (int j =0 ;j<n;j++){
          if(mapb.containsKey(A[j])){
              if(mapa.get(A[j]) != mapb.get(A[j]))
                  return false;
          }else{
            return false;
        }
      }



//        Set<Integer> set = new HashSet<>();
//        Set<Integer> setb = new HashSet<>();
//        for(int i=0;i< n;i++){
//            set.add(A[i]);
//            setb.add(B[i]);
//        }
//
//        if(set.size() != setb.size())
//            return false;
//
//        for(int j=0;j< n;j++){
//            if(!set.contains(B[j]))
//                return false;
//        }
        return true;
    }
}
