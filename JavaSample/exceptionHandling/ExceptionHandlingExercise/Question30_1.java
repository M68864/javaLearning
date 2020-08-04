package ExceptionHandlingExercise;

public class Question30_1 {
    public static void main(String[] args) {

        try {
            String str = "こんにちは";
            int num = Integer.parseInt(str);

            System.out.println("変換したら" + num + "になりました");
        } catch (NumberFormatException e) {
            System.out.println("例外が発生しました");
        }
    }
}
