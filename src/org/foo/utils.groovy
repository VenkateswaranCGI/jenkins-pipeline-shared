package org.foo
class utils implements Serializable {
  
  private final def script
  
  utils(def script) {
    this.script = script
  }
  
  void mvn() {
    //script.sh 'mvn -version'
    echo "hello"
  }
}
