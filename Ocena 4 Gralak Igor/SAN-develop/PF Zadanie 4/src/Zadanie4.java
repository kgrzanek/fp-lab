public class Zadanie4 {

    static void printPowerSet(char[] set, int set_size, long current) {
        if (current == (1 << set_size)) {
            return;
        }
        System.out.print("[");
        printSubset(set, set_size, current, 0);
        System.out.print("],");

        printPowerSet(set, set_size, current + 1);
    }

    static void printSubset(char[] set, int set_size, long current, int index) {
        if (index == set_size) {
            return;
        }

        if ((current & (1 << index)) > 0) {
            System.out.print(set[index]);
        }

        printSubset(set, set_size, current, index + 1);
    }

    public static void main(String[] args) {
        printPowerSet(new char[]{'1', '2', '3'}, 3, 0);
    }
}