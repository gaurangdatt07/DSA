package gfg.strings;

public class IsBinary {

    public boolean  isBinary(String customString){
        for(int i = 0 ; i  < customString.length();i++){
            if(customString.charAt(i)!= '1'&& customString.charAt(i)!='0')
                return false;
        }

        return true;
    }
}
