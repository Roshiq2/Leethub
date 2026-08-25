class Solution {
    public String rankTeams(String[] votes) {
        int[][]pos= new int[26][votes[0].length()];
        for(int i =0;i<votes.length;i++){
            for(int j=0;j<votes[i].length();j++){
                pos[votes[i].charAt(j)-'A'][j]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<votes[0].length();i++){
            //fr iterating over the pos
            int[]check= new int[26];
            Arrays.fill(check,1);
            boolean chek= false;
            for(int j=0;j<votes[0].length();j++){
                            int c=0;

              //for iterating over the columns now 
              int m =0;
              for(int z=0;z<26;z++){
                if(check[z]==1)m= Math.max(m,pos[z][j]);}
              for(int z=0;z<26;z++){
                if(pos[z][j]!=m)check[z]=0;
                else c++;
              }
              if(c==1){
                int po=0;
                for(int z=0;z<26;z++)if(check[z]==1)po=z;
                for (int k = 0; k < votes[0].length(); k++) {
    pos[po][k] = 0;
}     
chek=true;
                sb.append((char)('A'+po));
                  String g= sb.toString();
                        if(g.length() == votes[0].length())return g;
                break;
              }
            }
            if(!chek){
                for(int z=0;z<26;z++){
                    if(check[z]==1){
                        sb.append((char)('A'+z));
                        String g= sb.toString();
                        if(g.length() == votes[0].length())return g;
                        for (int k = 0; k < votes[0].length(); k++) {
    pos[z][k] = 0;
}
                    }
                }
            }
        }

    return sb.toString();
    }
}