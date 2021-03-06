package operator

import blockchain.Blockchain
import transaction.Transaction
import wallet.Wallet

/**
  * The operator's primary function is handle wallets and addresses, as well as transaction creation.
  * Most of its operations are CRUD related. Each operator has its own list of wallets and addresses,
  * meaning that it isn't synchronized between nodes.
  *
  * @param blockchain
  * @param wallets
  */
class Operator(blockchain: Blockchain, wallets: List[Wallet]) {

  /**
   *
   * @param wallet
   * @return
   */
  def addWallet(wallet: Wallet): Boolean = {
    false
  }

  /**
   *
   * @param password
   * @return
   */
  def createWalletFromPassword(password: String): Wallet = {
    null
  }

  /**
   *
   * @param hash
   * @return
   */
  def createWalletFromHash(hash: String): Wallet = {
    null
  }

  /**
   *
   * @param wallet
   * @param password
   * @return
   */
  def isWalletPasswordValid(wallet: Wallet, password: String): Boolean = {
    false
  }

  /**
   *
   * @return
   */
  def getWallets: List[Wallet] = {
    null
  }

  /**
   *
   * @param walletId
   * @return
   */
  def getWalletById(walletId: String): Wallet = {
    null
  }

  /**
   *
   * @param wallet
   * @return
   */
  def generateAddressForWallet(wallet: Wallet): String = {
    null
  }

  /**
   *
   * @param wallet
   * @return
   */
  def getAddressForWallet(wallet: Wallet): String = {
    null
  }

  /**
   *
   * @param wallet
   * @param address
   * @return
   */
  def isWalletAddressValid(wallet: Wallet, address: String): String = {
    null
  }

  /**
   *
   * @param wallet
   * @param address
   * @return
   */
  def getWalletBalance(wallet: Wallet, address: String): Long = {
    0
  }

  /**
   *
   * @param wallet
   * @param fromAddress
   * @param toAddress
   * @param amount
   * @param changeAddress
   * @return
   */
  def createTransaction(wallet: Wallet, fromAddress: String, toAddress: String, amount: Long, changeAddress: String): Transaction = {
    null
  }
}
