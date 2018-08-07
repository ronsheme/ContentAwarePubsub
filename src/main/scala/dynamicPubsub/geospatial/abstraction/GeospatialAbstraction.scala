package dynamicPubsub.geospatial.abstraction

import dynamicPubsub.generic.content.{ContentAbstraction, ContentAbstractor}
import dynamicPubsub.geospatial.Location

class GeospatialAbstraction extends ContentAbstraction[Location]{
  override def contains(c: Location): Boolean = ???

  override def getEmptyDescription: ContentAbstraction[Location] = ???
}
