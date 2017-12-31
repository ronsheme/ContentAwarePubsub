package dynamicPubsub.geospatial

import dynamicPubsub.generic.subscribe.ContentAwareSubscriber

class GeospatialDynamicSubscriber() extends ContentAwareSubscriber[Location,LocationedEvent] {
  def updateSubscription(location: Location): Unit ={

  }

}
