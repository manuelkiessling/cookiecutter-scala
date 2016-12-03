# cookiecutter-scala

[Cookiecutter](https://github.com/audreyr/cookiecutter) template for a most basic sbt-based Scala project setup.

## Usage

* Install Python and pip
* Install Cookiecutter: `pip install cookiecutter`
* Run `cookiecutter https://github.com/manuelkiessling/cookiecutter-scala`

This will ask the following questions with [defaults]:

    directory_name [myproject]:
    organization [org.example]:
    scala_version [2.11.8]:

If you'd answer these questions using the defaults, then you'd end up with a new project in folder `myproject`.

The project will have the following characteristics:

- The directory name also acts as the sbt project name
- `organization` and `directory_name` together form the Scala package name structure - thus, the fully qualified name of
  the Main class would be `org.example.myproject.Main`
- `logback-classic`, `scala-logging`, and `scalatest` are added as dependencies
