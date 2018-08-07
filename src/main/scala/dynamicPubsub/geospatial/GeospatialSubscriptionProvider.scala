package dynamicPubsub.geospatial

import dynamicPubsub.generic.content.{ContentAbstractor, ContentTopicPredicate}
import dynamicPubsub.generic.subscribe.{Subscriber, SubscriptionProvider}
import dynamicPubsub.geospatial.abstraction.GeospatialAbstractor

class GeospatialSubscriptionProvider(subscribers:List[Subscriber[Location,LocatedEvent]], locationAbstractor:ContentAbstractor[Location],
                                     contentTopicPredicate: ContentTopicPredicate[Location]) extends SubscriptionProvider[Location, LocatedEvent](subscribers,locationAbstractor,contentTopicPredicate){
  locationAbstractor = new GeospatialAbstractor
}
