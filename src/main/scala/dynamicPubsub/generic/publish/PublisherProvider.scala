package dynamicPubsub.generic.publish

import dynamicPubsub.generic.content.{ContentTopicPredicate, Event,Content}

abstract class PublisherProvider[C<:Content[C],E<:Event[C]](contentTopicPredicate: ContentTopicPredicate[C]){

  def getPublishers:List[Publisher[C,E]]

  def getPublishers(contentToPublish:C):List[Publisher[C,E]] = {
    getPublishers.filterNot{ p=>contentTopicPredicate.test(p.topic,contentToPublish)}
  }
}
