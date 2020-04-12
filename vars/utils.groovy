package org.foo
class Utilities {
  def mvn(script, args) {
    script.sh 'mvn -version'
  }
}
