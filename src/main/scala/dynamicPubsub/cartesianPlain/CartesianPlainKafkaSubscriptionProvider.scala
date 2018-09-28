package dynamicPubsub.cartesianPlain

import dynamicPubsub.cartesianPlain.abstraction.CartesianPlainAbstractor
import dynamicPubsub.generic.content.{ContentAbstractor, ContentTopicPredicate}
import dynamicPubsub.generic.subscribe.{Subscriber, SubscriptionProvider}
import dynamicPubsub.kafka.subscribe.KafkaSubscriber

//ideally we would want to decouple the content type from the pubsub infrastructure, but I already have too many interfaces without implementation now.
//TODO: use PubsubSubscriberProvider instead of creating kafka subscribes specifically
class CartesianPlainKafkaSubscriptionProvider(pointAbstractor: ContentAbstractor[CartesianPoint] = new CartesianPlainAbstractor,
                                              contentTopicPredicate: ContentTopicPredicate[CartesianPoint]) extends SubscriptionProvider[CartesianPoint, CartesianPointEvent](pointAbstractor, contentTopicPredicate) {
  override def getSubscribers: List[Subscriber[CartesianPoint, CartesianPointEvent]] = CartesianPlainKafkaSubscriptionProvider.subscribers
}

object CartesianPlainKafkaSubscriptionProvider {
  val subscribers: List[Subscriber[CartesianPoint, CartesianPointEvent]] = StaticPlainInit.getRectangles.map(rectangle=>new KafkaSubscriber(rectangle.toString))
}
