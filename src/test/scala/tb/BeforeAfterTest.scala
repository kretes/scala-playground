package tb

import org.specs2.mutable.{After, Specification}
import org.specs2.specification.{SpecificationStructure, Scope}
import org.specs2.reporter.{ExecutableSpecification, Executor}
import org.specs2.main.Arguments

class BeforeAfterTest extends Specification with Executor{
  sequential   //this makes it run sequentially

  trait before extends Scope {
    println("before")
  }

  trait myAfter extends After {
    def after = println("after")
  }

  "this is the first example" in new before {
    (1 to 5) must have size (5)
    println("in1")
  }

  "this is the 2nd example" in new before with myAfter {
    (1 to 5) must have size (5)
    println("in2")
  }

}
