import java.util.*;
class JavaStack{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            String input=sc.next();

            Stack<String> stack = new Stack<String>();

            for (int i = 0; i < input.length(); i++){

                String currentChar = input.substring(i,i+1);

                if (currentChar.equals("[") || currentChar.equals("(") || currentChar.equals("{"))
                    stack.push(currentChar);

                else if (currentChar.equals("}") && stack.isEmpty() == false){

                    if (stack.peek().equals("{"))
                        stack.pop();
                }
                else if (currentChar.equals(")") && stack.isEmpty() == false){

                    if (stack.peek().equals("("))
                        stack.pop();
                }
                else if (currentChar.equals("]") && stack.isEmpty() == false){

                    if (stack.peek().equals("["))
                        stack.pop();
                }
                else
                    stack.push(currentChar);
            }
            if (stack.isEmpty())
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
