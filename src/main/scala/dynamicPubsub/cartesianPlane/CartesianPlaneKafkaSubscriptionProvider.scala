package dynamicPubsub.cartesianPlane

import dynamicPubsub.cartesianPlane.abstraction.CartesianPlaneAbstractor
import dynamicPubsub.generic.content.{ContentAbstractor, ContentTopicPredicate}
import dynamicPubsub.generic.subscribe.{Subscriber, SubscriptionProvider}
import dynamicPubsub.kafka.subscribe.KafkaSubscriber

//ideally we would want to decouple the content type from the pubsub infrastructure, but I already have too many interfaces without implementation now.
//TODO: use PubsubSubscriberProvider instead of creating kafka subscribes specifically
class CartesianPlaneKafkaSubscriptionProvider(pointAbstractor: ContentAbstractor[CartesianPoint] = new CartesianPlaneAbstractor,
                                              contentTopicPredicate: ContentTopicPredicate[CartesianPoint]) extends SubscriptionProvider[CartesianPoint, CartesianPointEvent](pointAbstractor, contentTopicPredicate) {
  override def getSubscribers: List[Subscriber[CartesianPoint, CartesianPointEvent]] = CartesianPlaneKafkaSubscriptionProvider.subscribers
}

object CartesianPlaneKafkaSubscriptionProvider {
  val subscribers: List[Subscriber[CartesianPoint, CartesianPointEvent]] = StaticPlaneInit.getRectangles.map(rectangle=>new KafkaSubscriber(rectangle.toString))
}
