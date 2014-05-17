package tb

import org.specs2.mutable.Specification
import org.specs2.specification.AllExpectations

class AllExpectationsTest extends Specification with AllExpectations {

  "The 'Hello world' string" should {
    "be verified" in {
      "Hello world" must haveSize(10)
      "Hello world" must startWith("yo")
      "Hello world" must endWith("hej")
    }
  }

}
