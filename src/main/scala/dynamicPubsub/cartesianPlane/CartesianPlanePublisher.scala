package dynamicPubsub.cartesianPlane

import dynamicPubsub.generic.publish.{ContentAwarePublisher, PublisherProvider}

class CartesianPlanePublisher(val cartesianPointPublisherProvider:PublisherProvider[CartesianPoint,CartesianPointEvent]) extends ContentAwarePublisher[CartesianPoint,CartesianPointEvent](cartesianPointPublisherProvider) {

}
