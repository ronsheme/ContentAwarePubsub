package dynamicPubsub.generic.content

trait ContentAwareDescription[C<:Content] {
 def contains(c:C):Boolean
  def getEmptyDescription:ContentAwareDescription[C]
}
