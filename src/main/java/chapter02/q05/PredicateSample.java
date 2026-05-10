package chapter02.q05;

class PredicateSample {
  private int num;

  public PredicateSample(int num) {
    this.num = num;
  }

  // equals()をオーバーライドしないと、list.contains()は常にfalseを返すため、以下のようにequals()をオーバーライドする必要がある
  public boolean equals(Object obj) {
    if (obj instanceof PredicateSample == false) {
      return false;
    }

    if (this.num == ((PredicateSample) obj).num) {
      return true;
    }

    return false;
  }
}
