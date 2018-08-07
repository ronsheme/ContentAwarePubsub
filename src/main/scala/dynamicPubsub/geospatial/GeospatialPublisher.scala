package dynamicPubsub.geospatial

import dynamicPubsub.generic.publish.{ContentAwarePublisher, PublisherProvider}

class GeospatialPublisher(val geospatialPublisherProvider:PublisherProvider[Location,LocatedEvent]) extends ContentAwarePublisher[Location,LocatedEvent](geospatialPublisherProvider) {

}
