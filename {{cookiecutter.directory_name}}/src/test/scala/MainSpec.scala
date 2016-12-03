package {{cookiecutter.organization}}.{{cookiecutter.directory_name}}

import org.scalatest.{FunSpec, Matchers}

class MainSpec extends FunSpec with Matchers {

  describe("The Main class") {

    it ("should provide a valid main method") {
      Main.main(Array.empty) should be(())
    }

  }

}
