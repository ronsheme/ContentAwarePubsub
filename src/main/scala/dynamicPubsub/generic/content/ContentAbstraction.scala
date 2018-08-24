package dynamicPubsub.generic.content
//e.g. bounding box of locations
trait ContentAbstraction[C<:Content[C]] {
 def contains(c:C):Boolean
 def getEmptyDescription:ContentAbstraction[C]
}
