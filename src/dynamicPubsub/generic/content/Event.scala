package dynamicPubsub.generic.content

trait Event[C<:Content] {
  def getContent:C
}
