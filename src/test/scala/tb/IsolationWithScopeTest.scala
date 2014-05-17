package tb

import org.specs2.mutable.Specification
import org.specs2.specification.Scope

class IsolationWithScopeTest extends Specification {

  trait context extends Scope {
    val list = scala.collection.mutable.MutableList(1, 2, 3, 4)
  }

  "this is the first example" in new context {
    list.+=(5) must have size (5)
  }

  "this is the 2nd example" in new context {
    list.+=(6) must have size (5)
  }

}
