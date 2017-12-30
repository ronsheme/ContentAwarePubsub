package dynamicPubsub.generic.publish

import dynamicPubsub.generic.content.Event

class PublisherProvider[C,E<:Event[C]](availablePublishers:List[Publisher[C,E]],contentPublisherPredicate: ContentPublisherPredicate[C]){

  def getPublishers(contentToPublish:C):List[Publisher[C,E]] = {
    availablePublishers.filterNot{p=>contentPublisherPredicate.test(p.topic,contentToPublish)}
  }
}
