import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("(("));
	}
	public static boolean isValid(String s) {
        if(s == null || s.length() == 1){
        	return false;
        }
		Map<Character,Character> bracketMap = new HashMap<Character,Character>();
        fillMap(bracketMap);
        char c[] = s.toCharArray();
        Stack bracketStack = new Stack();
        for(int i = 0;i < c.length;i++){
        	if(bracketMap.containsValue(c[i])){
        		bracketStack.push(c[i]);
        	}else if(bracketMap.containsKey(c[i])){
        		if(bracketStack.isEmpty()) return false;
        		if(!(bracketStack.pop() ==  bracketMap.get(c[i]))){
        			return false;
        		}
        	}else{
        		return false;
        	}
        }
    	if(!bracketStack.isEmpty()){
    		return false;
    	}
        return true;
    }
	public static void fillMap(Map<Character,Character> bracketMap){
		bracketMap.put(')','(');
		bracketMap.put('}','{');
		bracketMap.put(']','[');
	}
	
}
