package dynamicPubsub.geospatial

import dynamicPubsub.generic.publish.{ContentAwarePublisher, PublisherProvider}

class GeospatialPublisher(val geospatialPublisherProvider:PublisherProvider[Location,LocationedEvent]) extends ContentAwarePublisher[Location,LocationedEvent](geospatialPublisherProvider) {

}
