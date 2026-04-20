class Solution {

    public String encode(List<String> strs) {
        StringBuilder strBuffer = new StringBuilder();

        for (String word : strs) {
            for (int j = 0; j < word.length(); j++) {
                strBuffer.append((int) word.charAt(j));
                strBuffer.append(',');
            }
            strBuffer.append(':');
        }
        return strBuffer.toString();
    }

    public List<String> decode(String str) {
    List<String> strList = new ArrayList<>();

    String[] strArr = str.split(":", -1);

    for (int i = 0; i < strArr.length; i++) {

        // skip ONLY the last empty part (due to trailing :)
        if (i == strArr.length - 1 && strArr[i].isEmpty()) continue;

        String part = strArr[i];

        // if original string was empty
        if (part.isEmpty()) {
            strList.add("");
            continue;
        }

        String[] strArray = part.split(",", -1);
        StringBuilder strB = new StringBuilder();

        for (String numStr : strArray) {
            if (numStr.isEmpty()) continue;

            int num = Integer.parseInt(numStr);
            strB.append((char) num);
        }

        strList.add(strB.toString());
    }

    return strList;
}
}