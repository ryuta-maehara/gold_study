package main.java.chapter01.q02;

public class Test {

    public static void main(String[] args) {

        // ジェネリクスを使用しない場合は、Object型で値を取得する必要がある。
        Value v1 = new Value("Hello");
        Object obj = v1.getVal();
        // System.out.println(v1.getVal()); // 取得した値はObject型なので、必要に応じてキャストする必要がある。(危険なキャスト！)
        System.out.println(obj);

        // ジェネリクスを使用することで、型安全に値を取得できる。
        Value<Integer> v2 = new Value<Integer>(123);
        System.out.println(v2.getVal());
    }
}
