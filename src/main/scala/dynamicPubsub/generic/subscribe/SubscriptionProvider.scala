package dynamicPubsub.generic.subscribe

import dynamicPubsub.generic.content.{Content,ContentAbstractor, ContentTopicPredicate, Event}

abstract class SubscriptionProvider[C<:Content[C],E<:Event[C]](abstractor:ContentAbstractor[C],
                                          contentTopicPredicate: ContentTopicPredicate[C]) {
  abstract def getSubscribers:List[Subscriber[C,E]]
  def getSubscribers(content:C):List[Subscriber[C,E]]={
    val abstractions = abstractor.abstractContent(content)
    getSubscribers.filter { subscriber => !abstractions.exists { abstraction => contentTopicPredicate.test(subscriber.topic, abstraction) } }
  }
}
