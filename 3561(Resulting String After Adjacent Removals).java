class Solution {
    public String resultingString(String s) {
      if(s.length() == 1)  return s;
      StringBuilder sb = new StringBuilder();

      for(char c:s.toCharArray()){
        if(sb.length()>0){
          char l = sb.charAt(sb.length()-1);
          if(Math.abs(l-c) == 1 || Math.abs(l-c) == 25){
            sb.deleteCharAt(sb.length()-1);
            continue;
          }
        }
        sb.append(c);
      }

      return sb.toString();
    }
};
