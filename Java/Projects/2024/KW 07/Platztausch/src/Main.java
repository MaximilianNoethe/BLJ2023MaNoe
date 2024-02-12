
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] unevenSequence = {0, 1, 2, 3, 4, 5, 6};
        int[] evenSequence = {0, 1, 2, 3, 4, 5};

        int lengthUneven = unevenSequence.length;
        int lengthEven = evenSequence.length;

        for (int i = 0; i < lengthUneven / 2; i++) {
            int temp = unevenSequence[i];
            unevenSequence[i] = unevenSequence[lengthUneven - 1 - i];
            unevenSequence[lengthUneven - 1 - i] = temp;
        }

        for (int i = 0; i < lengthEven / 2; i++) {
            int temp = evenSequence[i];
            evenSequence[i] = evenSequence[lengthEven - 1 - i];
            evenSequence[lengthEven - 1 - i] = temp;
        }

        System.out.println("uneven: " + Arrays.toString(unevenSequence));
        System.out.println("even: " + Arrays.toString(evenSequence));
    }
}