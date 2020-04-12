package org.foo
class utils implements Serializable {

  void mvn() {
    sh 'mvn -version'
    println('hello')
  }
}
