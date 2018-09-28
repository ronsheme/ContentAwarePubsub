package dynamicPubsub.cartesianPlain

import dynamicPubsub.generic.subscribe._

class CartesianPlainDynamicSubscriber(provider: SubscriptionProvider[CartesianPoint, CartesianPointEvent],
                                      consumer: CartesianPointEvent => Unit, private var currentSubscribers: List[Subscriber[CartesianPoint, CartesianPointEvent]]) extends ContentAwareSubscriber[CartesianPoint,CartesianPointEvent](provider,consumer,currentSubscribers) {
   
}
