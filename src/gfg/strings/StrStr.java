package gfg.strings;

public class StrStr {


    public int strstr(String s , String x){

        for(int i = 0 ; i  <=s.length()-x.length();i++){
            int j = 0 ;
            while(j<x.length()){
                if(s.charAt(i)!=x.charAt(j))
                    break;
                i++;j++;

            }

            if(j==x.length())
                return (i-j);
            i=i-j;
        }

        return -1;
    }

}
