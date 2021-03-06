package jaskell.sql

/**
 * TODO
 *
 * @author mars
 * @version 1.0.0
 * @since 2020/05/18 20:16
 */
trait CouldAs extends Directive {
  def as(n: Name): As = new As {
    override val prefix: Directive = CouldAs.this
    override val name: Name = n
  }

  def as(n: String): As = new As {
    override val prefix: Directive = CouldAs.this
    override val name: Name = new Name(n)
  }
}
