package ExceptionHandlingExercise;


public class Question30_4 {
    public static void main(String[] args) {

        try {
            int[] numArray = new int[5];

            TestException testException = new TestException();
            testException.inputArray(numArray, 5, 3);

        } catch (Question30_3 e) {
            System.out.println("例外Question30_3が発生しました");
        }
    }
}
