package test;

public class Test {

  public int foo(String bar) {
    try {
      return Integer.parseInt(bar);
    } catch (Exception e) {
      return 0;
    }
  }
}
