package org.foo
class Utilities {
  static String foo = "bar"
  static def mvn(script, args) {
    script.sh 'mvn -version'
  }
}
