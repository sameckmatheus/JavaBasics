package fundamentos_3;

public class Arrays {
    public static void main(String[] args) {
        int[] intArray = { 2, 5, 46, 12, 34 };

        System.out.print("Ascendente: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        System.out.println();

        System.out.print("Descendente: ");
        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
        }
    }
}
