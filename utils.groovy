package org.foo
class Utilities {
  static def mvn(script, args) {
    script.sh 'mvn -version'
  }
}
