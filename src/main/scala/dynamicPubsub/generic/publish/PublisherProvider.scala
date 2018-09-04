package dynamicPubsub.generic.publish

import dynamicPubsub.generic.content.{ContentTopicPredicate, Event,Content}

class PublisherProvider[C<:Content[C],E<:Event[C]](publishers:List[Publisher[C,E]],
                                       contentTopicPredicate: ContentTopicPredicate[C]){

  def getPublishers(contentToPublish:C):List[Publisher[C,E]] = {
    publishers.filterNot{ p=>contentTopicPredicate.test(p.topic,contentToPublish)}
  }
}
