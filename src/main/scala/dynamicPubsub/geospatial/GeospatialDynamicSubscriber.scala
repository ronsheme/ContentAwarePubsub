package dynamicPubsub.geospatial

import dynamicPubsub.generic.subscribe._

class GeospatialDynamicSubscriber(provider: SubscriptionProvider[Location, LocationedEvent],
                                  consumer: LocationedEvent => Unit,private var currentSubscribers: List[Subscriber[Location, LocationedEvent]]) extends ContentAwareSubscriber[Location,LocationedEvent](provider,consumer,currentSubscribers) {
  def updateSubscription(location: Location): Unit ={

  }

}
