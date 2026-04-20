class Solution {

    public String encode(List<String> strs) {
        StringBuilder strBuild = new StringBuilder();
        for(String str: strs){
            strBuild.append(str.length()).append('#').append(str);
        }
        return strBuild.toString();
    }

    public List<String> decode(String str) {
        List<String> strArr = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));

            j++;

            strArr.add(str.substring(j,j + length));

            //I forgot that i will at the beginning of next string
            i = j + length;

        }
        return strArr;
    }
}