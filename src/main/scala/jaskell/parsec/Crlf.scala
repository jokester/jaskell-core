package jaskell.parsec

import java.io.EOFException

/**
 * Crlf 即 haskell parsec 的 crlf 算子,匹配 \r\n .
 *
 * @author mars
 * @version 1.0.0
 * @since 2020/05/09 14:16
 */
class Crlf(val r:Ch = Ch('\r'), val n:Ch = Ch('\n')) extends Parsec[String, Char] {
  @throws[EOFException]
  @throws[ParsecException]
  override def apply[S <: State[Char]](s: S): String = {
    r(s)
    n(s)
    "\r\n"
  }
}

object Crlf {
  def apply(): Crlf = new Crlf()
}
