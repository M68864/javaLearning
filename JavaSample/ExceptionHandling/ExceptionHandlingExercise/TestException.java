package ExceptionHandlingExercise;

public class TestException {

    void inputArray(int[] array, int index, int num) throws Question30_3 {

        try{
            array[index] = num;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Question30_3();
        }
    }

}
