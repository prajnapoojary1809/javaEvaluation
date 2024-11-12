package Problem4;

public class DualStack {
        int top1, top2;
        int[] arr;
        int size;

        public DualStack(int n) {
            size = n;
            arr = new int[n];
            top1 = -1;
            top2 = size;
        }

        public void push1(int x) {
            if (top1 + 1 == top2) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top1] = x;
        }

        public void push2(int x) {
            if (top1 + 1 == top2) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[--top2] = x;
        }

        public int pop1() {
            if (top1 == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top1--];
        }

        public int pop2() {
            if (top2 == size) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top2++];
        }

        public static void main(String[] args) {
            int n=20;
            DualStack ds = new DualStack(n);

            while (true) {
                System.out.println("\nChoose an operation:");
                System.out.println("1. Push to Stack 1");
                System.out.println("2. Pop from Stack 1");
                System.out.println("3. Push to Stack 2");
                System.out.println("4. Pop from Stack 2");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice;

                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to push to Stack 1: ");
                        int x = 10;
                        ds.push1(x);
                        break;
                    case 2:
                        System.out.println("Popped element from Stack 1: " + ds.pop1());
                        break;
                    case 3:
                        System.out.print("Enter the element to push to Stack 2: ");
                        int y = 20;
                        ds.push2(y);
                        break;
                    case 4:
                        System.out.println("Popped element from Stack 2: " + ds.pop2());
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
    }
