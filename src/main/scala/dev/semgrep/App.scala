package dev.semgrep

import org.keycloak.saml.processing.core.util.XMLSignatureUtil

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    XMLSignatureUtil.validate("hello")
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}
