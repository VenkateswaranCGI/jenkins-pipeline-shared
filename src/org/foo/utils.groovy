package org.foo
class utils implements Serializable {

  void mvn() {
    script.sh 'mvn -version'
    println('hello')
  }
}
