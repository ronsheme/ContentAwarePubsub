package dynamicPubsub.generic.subscribe

import dynamicPubsub.generic.content.{Content,ContentAbstractor, ContentTopicPredicate, Event}

class SubscriptionProvider[C<:Content,E<:Event[C]](subscribers:List[Subscriber[C,E]],abstractor:ContentAbstractor[C],
                                          contentTopicPredicate: ContentTopicPredicate[C]) {
  def getSubscribers(content:C):List[Subscriber[C,E]]={
    val abstractions = abstractor.abstractContent(content)
    subscribers.filter { subscriber => !abstractions.exists { abstraction => contentTopicPredicate.test(subscriber.topic, abstraction) } }
  }
}
