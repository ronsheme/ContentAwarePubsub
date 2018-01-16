package dynamicPubsub.generic.subscribe

import dynamicPubsub.generic.content.{ContentAbstraction, ContentTopicPredicate, Event}

class ContentAwareSubscriber[C, E <: Event[C]](provider: SubscriptionProvider[C, E],
                                               consumer: E => Unit,private var currentSubscribers: List[Subscriber[C, E]]) {

  def subscribe(content: C): Unit = {
    val updatedSubscribers = provider.getSubscribers(content)

    val (relevant,irrelevant) = currentSubscribers partition { sub1:Subscriber[C,E] => !updatedSubscribers.exists { sub2 => sub2.topic.equals(sub1.topic) } }
    irrelevant.foreach(subscriber=>subscriber.unsubscribe())

    val newSubscribers = updatedSubscribers filter {sub1:Subscriber[C,E] => !currentSubscribers.exists { sub2 => sub2.topic.equals(sub1.topic) }}
    newSubscribers.foreach(subscriber=>subscriber.subscribe())
    currentSubscribers = relevant ::: newSubscribers
  }
}
