package chapter06.q09;

public class PostCode {

  private String code;
  private String perfecture;
  private String district;
  private String town;

  public PostCode(String code, String perfecture, String district, String town) {
    this.code = code;
    this.perfecture = perfecture;
    this.district = district;
    this.town = town;
  }

  @Override
  public String toString() {
    return code + " " + perfecture + " " + district + " " + town;
  }
}
