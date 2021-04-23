package arrayExamples1;

public class ArrayExamplesTests {
    public static void main(String[] args) {
        int[] arr = {2, 15, 15, 37, 780, 68158, 87, 19878481, 37, 1};
        ArrayExamples masiv = new ArrayExamples();
        masiv.repeatable(arr,5);
        masiv.IsIndexExists(arr,7);
        masiv.index(arr,4);
        masiv.repeat(arr);
        masiv.sorting(arr);
    }
}
