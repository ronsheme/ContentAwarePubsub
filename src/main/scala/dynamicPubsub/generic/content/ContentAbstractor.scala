package dynamicPubsub.generic.content
//e.g. for location get bounding box(es), number of elements in the returned list depends on granularity of topics per abstraction
trait ContentAbstractor[C<:Content] {
  def abstractContent(content:C):List[ContentAbstraction[C]]
}
