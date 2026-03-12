package main.java.chapter01.q02;

// ジェネリクスを使用しない場合は、Object型で値を取得する必要がある。
// ジェネリクスを使用することで、型安全に値を取得できる。
public class Value<T> {
    T val; // ジェネリクスを使用して、任意の型の値を保持できるフィールド

    // ジェネリクスを使用しない場合は、Object型で値を取得する必要がある。
    public Value(T val) {
        super(); // Objectクラスのコンストラクタを呼び出す（省略可能）
        this.val = val; // 引数で渡された値をフィールドにセットする
    }

    // ジェネリクスを使用することで、型安全に値を取得できる。
    public T getVal() {
        return val;
    }

}
