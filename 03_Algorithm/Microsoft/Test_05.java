package Microsoft;

public class Test_05 {
    public static void main(String[] args) {
        Solution05_02 solution05 = new Solution05_02();
        char[] result = new char[]{'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
        solution05.reverseWords(result);
        for (char a : result) {
            System.out.println(a);
        }
    }
}

class Solution05 {
    public void reverseWords(char[] s) {
        //有个地方存
        Node[] resultNode = new Node[s.length];
        Node tmp = new Node();
        int nodeIndex = 0;
        boolean isSpaceLast = false;
        for (int i = s.length - 1; i >= 0; i--) {
            if (i == s.length - 1) {
                tmp = new Node();
                tmp.value = s[s.length - 1];
                continue;
            }
            if (s[i] == ' ') {
                resultNode[nodeIndex] = tmp;
                nodeIndex++;
                isSpaceLast = true;
            } else {
                if (isSpaceLast) {
                    isSpaceLast = false;
                    tmp = new Node();
                    tmp.value = s[i];
                    if (i == 0) {
                        resultNode[nodeIndex] = tmp;
                    }
                } else {
                    Node current = new Node();
                    current.value = s[i];
                    current.father = tmp;
                    tmp = current;
                    if (i == 0) {
                        resultNode[nodeIndex] = tmp;
                    }
                }
            }
        }
        int index = 0;
        for (int i = 0; i < resultNode.length; i++) {
            if (resultNode[i] != null) {
                Node now = resultNode[i];
                do {
                    s[index] = now.value;
                    index++;
                    now = now.father;
                } while (now != null);
                if (index < s.length) {
                    s[index] = ' ';
                    index++;
                }
            }
        }
    }

    class Node {
        Node father;
        char value;
    }
}

//两次翻转
class Solution05_02 {
    public void reverseWords(char[] s) {
        int start = 0;
        for (int i = 0; i < s.length; i++) {
            if (i <= (s.length - 1) / 2) {
                char frontChar = s[i];
                char endChar = s[s.length - 1 - i];
                s[i] = endChar;
                s[s.length - 1 - i] = frontChar;
            }
            if (s[i] == ' ') {
                reverseOneWord(s, start, i - 1);
                start = i + 1;
            }
            if (i == s.length - 1) {
                reverseOneWord(s, start, i);
            }
        }
    }

    public void reverseOneWord(char[] s, int start, int end) {
        for (int a = 0; a < end - start; a++) {
            if (a <= (end - start) / 2) {
                char frontChar = s[start + a];
                char endChar = s[end - a];
                s[start + a] = endChar;
                s[end - a] = frontChar;
            } else {
                break;
            }
        }
    }
}

//两次翻转
class Solution05_03 {
    public void reverseWords(char[] s) {
        int n=s.length,l=0;
        for(int r=0;r<n;r++)
            if(s[r]==' '){
                reverse(s,l,r-1);
                l=r+1;
            }
        reverse(s,l,n-1);
        reverse(s,0,n-1);
    }

    private void reverse(char[]s,int l,int r) {
        for(char c=' ';l<r;l++,r--){
            c=s[l];s[l]=s[r];s[r]=c;
        }
    }
}
