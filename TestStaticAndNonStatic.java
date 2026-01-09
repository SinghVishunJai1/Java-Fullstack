public
class TestStatic {
 public
  static int staticVar = 10;
 public
  int nonStaticVar = 20;

 public
  static void staticMethod() {
    TestStatic t = new TestStatic();
    System.out.println();
    System.out.println("Welcome to static Test Method");
    System.out.println("Static variable is :" + staticVar);
    System.out.println("Non Static variable is :" + t.nonStaticVar);
  }

 public
  void nonStaticMethod() {
    TestStatic t = new TestStatic();
    System.out.println();
    System.out.println("Welcome to non static Test Method");

    System.out.println("Static variable is :" + staticVar);
    System.out.println("Non Static variable is :" + t.nonStaticVar);
  }

 public
  static void main(String[] args) {
    TestStatic t1 = new TestStatic();
    staticMethod();
    t1.nonStaticMethod();
  }

}

class DemoTest {
  static void staticDemoMethod(TestStatic obj) {
    System.out.println();
    System.out.println("Welcome to static Demo Method: ");
    System.out.println("Static variable is :" + TestStatic.staticVar);
    System.out.println("Non Static variable is :" + obj.nonStaticVar);
  }

  static void nonStaticDemoMethod(TestStatic obj) {
    System.out.println();
    System.out.println("Welcome to non static Demo Method: ");
    System.out.println("Static variable is :" + TestStatic.staticVar);
    System.out.println("Non Static variable is :" + obj.nonStaticVar);
  }

 public
  static void main(String[] args) {
    TestStatic t = new TestStatic();
    DemoTest d = new DemoTest();
    staticDemoMethod(t);
    d.nonStaticDemoMethod(t);
  }
}
