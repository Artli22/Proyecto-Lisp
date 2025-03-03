import java.util.Stack;

public class ProcesadorLisp {
    
    // Método para limpiar la entrada: elimina espacios innecesarios
    public static String cleanInput(String input) {
        return input.replaceAll("\\s+", " ").trim();
    }
    
    // Método para verificar el balance de paréntesis en la expresión
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; // Más paréntesis de cierre que de apertura
                }
                stack.pop();
            }
        }
        
        return stack.isEmpty(); // Debe estar vacío si está balanceado
    }
    
    public static void main(String[] args) {
        String expression = "(+ 2 (* V 8))";
        
        // Limpiar espacios innecesarios
        String cleanedExpression = cleanInput(expression);
        System.out.println("Expresión limpiada: " + cleanedExpression);
        
        // Verificar balance de paréntesis
        boolean balanced = isBalanced(cleanedExpression);
        System.out.println("Balance de paréntesis: " + (balanced ? "Correcto" : "Incorrecto"));
    }
}
