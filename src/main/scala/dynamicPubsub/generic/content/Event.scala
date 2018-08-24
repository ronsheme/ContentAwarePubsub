package dynamicPubsub.generic.content

trait Event[C<:Content[C]] {
  def getContent:C
}
