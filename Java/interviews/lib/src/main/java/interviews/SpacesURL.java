package interviews;

public class SpacesURL {

    public  String spacesURL(String str) {
        str = str.trim();
        int length = str.length();
        int secL = length;
        if(str.contains(" ")) {
            for(int i = 0; i < length; i++) {
                if(str.charAt(i) == ' ') {
                    secL = secL + 2;
                }
            }
            char[] oldArr = str.toCharArray();
            char[] newArr = new char[secL];
            int x = 0;
            for(int i = 0; i < length; i++) {
                if(oldArr[i] == ' ') {
                    newArr[x] = '%';
                    newArr[x+1] = '2';
                    newArr[x+2] = '0';
                    x += 3;
                } else {
                    newArr[x] = oldArr[i];
                    x++;
                }
            }
            str = new String(newArr, 0, secL);
        }
        return str;
    }

}
