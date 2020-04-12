package org.foo
class utils implements Serializable {
  void mvn(script, args) {
    script.sh 'mvn -version'
  }
}
