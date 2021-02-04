 HashMap<String,Integer> hs = new HashMap<>();
        
        for(int i=0;i<N;i++){
            if(hs.get(arr[i])==null){
                hs.put(arr[i], 1);
            }else
                hs.put(arr[i], hs.get(arr[i])+1);
        }
        
        int max = 0;
        int second_max = 0;
        for (Map.Entry<String,Integer> entry : hs.entrySet()){
            max = Math.max(max, entry.getValue());
        }
        for (Map.Entry<String,Integer> entry : hs.entrySet()){
            if(entry.getValue()!=max)
                second_max = Math.max(second_max, entry.getValue());
        }
        for (Map.Entry<String,Integer> entry : hs.entrySet()){
            if(entry.getValue()==second_max)
                return entry.getKey();
        }
        return "";
    }
}