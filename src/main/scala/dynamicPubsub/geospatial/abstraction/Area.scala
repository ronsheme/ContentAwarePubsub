package dynamicPubsub.geospatial.abstraction

import dynamicPubsub.generic.content.{ContentAbstraction, ContentAbstractor}
import dynamicPubsub.geospatial.Location

class Area(bottomLeft:Location,topRight:Location) extends ContentAbstraction[Location]{
  import Area._
  override def contains(c: Location): Boolean = bottomLeft.lte(c)  && c.lte(topRight)
  override def getEmptyDescription: ContentAbstraction[Location] = emptyAbstraction
}
object Area{
  val emptyAbstraction = new Area(new Location(Long.MaxValue,Long.MaxValue),new Location(Long.MinValue,Long.MinValue))
}