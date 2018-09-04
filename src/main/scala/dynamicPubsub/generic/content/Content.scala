package dynamicPubsub.generic.content
// e.g.location
trait Content[C] {
  def lte(other:C):Boolean
}
