import java.util.Arrays;
import java.util.EmptyStackException;
public class stackarray {
    public class Stack_Hawl {
        public static void main(String[] args) {
            // Samee stack integers ah
            BalaarinArrayStack<Integer> S1 = new BalaarinArrayStack<>();

            // Ku dar elements
            S1.push(100);
            S1.push(200);
            S1.push(300);

            // Muuji stack-ga
            S1.display();

            // Eeg element-iga ugu dambeeya
            System.out.println("Elementiga ugu dambeeya (peek): " + S1.peek());

            // Ka saar element
            System.out.println("Elementiga laga saaray (pop): " + S1.pop());

            // Mar kale muuji
            S1.display();

            // Ku dar elements cusub
            S1.push(40);
            S1.push(50);

            // Muuji stack-ga ugu dambeeya
            S1.display();

            // Cabirka stack-ga
            System.out.println("Cabirka stack-ga: " + S1.size());

            // Hubi in uu maran yahay
            System.out.println("Stack-ga ma maranyahay? " + S1.isEmpty());
        }
    }

    class BalaarinArrayStack<T> {
        private static final int asal = 2;
        private int kor;
        private T[] Array_stack;

        // No-arg constructor
        BalaarinArrayStack() {
            this(asal);
        }

        BalaarinArrayStack(int cabirka_hore) {
            kor = 0;
            Array_stack = (T[]) (new Object[cabirka_hore]);
        }

        // size
        public int size() {
            return kor;
        }

        // push method
        public void push(T item) {
            if (size() == Array_stack.length)
                Expand();
            Array_stack[kor] = item;
            kor++;
        }

        // pop method
        public T pop() {
            if (isEmpty())
                throw new EmptyStackException();
            else {
                T qiimaha = Array_stack[--kor];
                Array_stack[kor] = null;
                return qiimaha;
            }
        }

        // peek method
        public T peek() {
            if (isEmpty())
                throw new EmptyStackException();
            else
                return Array_stack[kor - 1];
        }

        // isEmpty method
        public boolean isEmpty() {
            return kor == 0;
        }

        // expand method
        public void Expand() {
            Array_stack = Arrays.copyOf(Array_stack, Array_stack.length * 2);
        }

        // display method
        public void display() {
            if (isEmpty())
                throw new EmptyStackException();
            else {
                System.out.println("Waxyaabaha ku jira BalaarinArrayStack-ga waa:");
                for (int x = 0; x < kor; x++)
                    System.out.print(Array_stack[x] + " ");
                System.out.println();
            }
        }
    }
}
