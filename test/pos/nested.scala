// A non-trivial example of nested classes (mostly to test
// ExplicitOuterClasses).

class A(pa : Int) {
  def a1 = pa;
  class B(pb : Int) {
    def b1 = pa+pb+a1;
    class C(pc : Int) extends A(b1) {
      def c1 = pc+pb+pa
    }
    val c1 = new C(66)
  }
}

class M(x : Int) {
  def m1 = x
}

class A1(x : Int) extends A(x) with M(x) {
  class D() extends B(42) {
    val c2 = new C(66);
    class E() extends C(5) {
      def e1 = c1+b1+a1;
      def e2 = new D();
    }
  }
}
