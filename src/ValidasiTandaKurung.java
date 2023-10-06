import java.util.Stack;

public class ValidasiTandaKurung {
    public static void main(String[] args) {

        String rumus = "{24 x (3 + 6) x 2}";
        String rumus2 = "(24 x {3 + 6) x 2))}";

        System.out.println("Rumus 1" + cekString(rumus));
        System.out.println("Rumus 2" + cekString(rumus2));

        if (cekKurung(rumus)) {
            System.out.println("Rumus1 valid");
        } else {
            System.out.println("Rumus1 tidak valid");
        }


        if (cekKurung(rumus2)) {
            System.out.println("Rumus2 valid");
        } else {
            System.out.println("Rumus2 tidak valid");
        }


    }
    public static String cekString (String rumus)
    {
        int counter = 0;

        for (int i=0; i < rumus.length(); i++)
        {
            char huruf =  rumus.charAt(i);
            if (huruf == '(')
            {
                counter++;
            }
            else if (huruf == ')' ) {
                counter--;
                if (counter < 0) {
                    return "Tanda kurung salah";
                }
            }
        }

        if (counter == 0)
        {
            return "Tanda kurung sudah benar";
        }
        else {
            return "Tanda kurung salah";
        }

    }

    public static boolean cekKurung(String rumus){

        Stack<Character> stack = new Stack<>();
        char[] karakter = rumus.toCharArray();
        for (int i = 0; i <= karakter.length; i++) {

            if (karakter[i] == '(' || karakter[i] == '{'){
                stack.push(karakter[i]);
            } else if (karakter[i] == ')') {
                if (stack.empty() || stack.pop() != '('){
                    return false;
                }
            } else if (karakter[i] == '}') {
                if(stack.empty() || stack.pop() != '{'){

                    return false;
                }
            }
        }
        return  stack.empty();
    }
}
