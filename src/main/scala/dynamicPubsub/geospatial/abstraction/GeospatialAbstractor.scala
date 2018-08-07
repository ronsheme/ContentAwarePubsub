package dynamicPubsub.geospatial.abstraction

import dynamicPubsub.generic.content.{ContentAbstraction, ContentAbstractor}
import dynamicPubsub.geospatial.Location

class GeospatialAbstractor extends ContentAbstractor[Location] {

  override def abstractContent(content: Location): List[ContentAbstraction[Location]] = ???
}
