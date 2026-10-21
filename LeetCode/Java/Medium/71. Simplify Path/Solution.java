import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] Str = path.split("/");

        for (String part : Str) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } 
            if (part.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(part);
            }
        }

        if (st.isEmpty()) {
            return "/";
        }

        StringBuilder stb = new StringBuilder();
        // Iterating over Stack in Java traverses from bottom to top (FIFO order)
        for (String dir : st) {
            stb.append("/").append(dir);
        }

        return stb.toString();
    }
}