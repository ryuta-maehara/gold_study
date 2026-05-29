package chapter03.q015;

public class Value {
  public String data;

  public Value(String data) {
    this.data = data;
  }

  @Override
  public int hashCode() {
    return 100; // 常に同じハッシュコードを返すため、重複がないとみなされる. AもBもCも同じとみなされるため、結果は1になる.
  }

  @Override
  public boolean equals(Object obj) {
    return true; // 常に等しいとする
  }
}
