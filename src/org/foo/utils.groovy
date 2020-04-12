package org.foo
class utils implements Serializable {
  
  utils(def script) {
    this.script = script
  }
  
  void mvn(script, args) {
    script.sh 'mvn -version'
  }
}
