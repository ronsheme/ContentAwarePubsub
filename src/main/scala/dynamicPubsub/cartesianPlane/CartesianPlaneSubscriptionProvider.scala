package dynamicPubsub.cartesianPlane

import dynamicPubsub.cartesianPlane.abstraction.CartesianPlaneAbstractor
import dynamicPubsub.generic.content.{ContentAbstractor, ContentTopicPredicate}
import dynamicPubsub.generic.subscribe.{Subscriber, SubscriptionProvider}

class CartesianPlaneSubscriptionProvider(subscribers:List[Subscriber[CartesianPoint,CartesianPointEvent]], pointAbstractor:ContentAbstractor[CartesianPoint]=new CartesianPlaneAbstractor,
                                         contentTopicPredicate: ContentTopicPredicate[CartesianPoint]) extends SubscriptionProvider[CartesianPoint, CartesianPointEvent](subscribers,pointAbstractor,contentTopicPredicate){
}
