package crypto

import java.math.BigInteger
import java.security.MessageDigest

import crypto.ecdsa.{ECDSA, Key}

/**
  * A helper object for doing crypto things like hashing, etc.
  */
object Crypto {

  /**
    * Return a hashed value of some String input
    */
  def hash(input: String): String = {
    sha256(input)
  }

  /**
    * Return a SHA-256 hash of some String input
    */
  def sha256(input: String): String = {
    val message: Array[Byte] = MessageDigest.getInstance("SHA-256").digest(input.getBytes("UTF-8"))
    String.format("%064x", new BigInteger(1, message))
  }

  def isValidSignature(publicKey: BigInt, signature: BigInt, messageHash: String): Boolean = {
    ECDSA.verify(signature, Key.pub(publicKey, ECDSA.p192), messageHash)
  }
}
