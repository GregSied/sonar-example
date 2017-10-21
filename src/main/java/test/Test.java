package test;

public class Test {

  public int foo(String bar) {
    int a = 2;
    int b = 3;
    int c = a + b;
    try {
      return Integer.parseInt("2");
    } catch (Exception e) {
      return c;
    }
  }

  public int baz(String bar) {
    int a = 2;
    int b = 3;
    int c = a + b;
    try {
      return Integer.parseInt("2");
    } catch (Exception e) {
      return c;
    }
  }
}
