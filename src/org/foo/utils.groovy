package org.foo
class Utilities implements Serializable {
  void mvn(script, args) {
    script.sh 'mvn -version'
  }
}
