package dynamicPubsub.cartesianPlain

import dynamicPubsub.generic.publish.{ContentAwarePublisher, PublisherProvider}

class CartesianPlainPublisher(val cartesianPointPublisherProvider:PublisherProvider[CartesianPoint,CartesianPointEvent]) extends ContentAwarePublisher[CartesianPoint,CartesianPointEvent](cartesianPointPublisherProvider) {

}
