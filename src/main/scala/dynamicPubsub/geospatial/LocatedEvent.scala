package dynamicPubsub.geospatial

import dynamicPubsub.generic.content.Event

class LocatedEvent(val location:Location) extends Event[Location]{
  override def getContent: Location = location
}
