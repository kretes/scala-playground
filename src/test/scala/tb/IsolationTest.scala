package tb

import org.specs2.mutable.Specification

class IsolationTest extends Specification {
  isolated   //this will make specs2 create new specification class instance for every test just like junit is doing by default


  val list = scala.collection.mutable.MutableList(1, 2, 3, 4)

    "this is the first example" in {
      list.+=(5) must have size(5)
    }
    "this is the first example" in {
      list.+=(6) must have size(5)
    }

}
