package mock_exam.q02;

public class Sample {
    public static void main(String[] args) {
        Test t = (e) -> {
            return e.name() + " is " + e.price() + " yen.";
        };
        Item apple = new Item("Apple", 100);
        System.out.println(t.toString(apple));
    }
}
