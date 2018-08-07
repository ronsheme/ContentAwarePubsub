package dynamicPubsub.geospatial

import dynamicPubsub.generic.subscribe._

class GeospatialDynamicSubscriber(provider: SubscriptionProvider[Location, LocatedEvent],
                                  consumer: LocatedEvent => Unit, private var currentSubscribers: List[Subscriber[Location, LocatedEvent]]) extends ContentAwareSubscriber[Location,LocatedEvent](provider,consumer,currentSubscribers) {
   
}
