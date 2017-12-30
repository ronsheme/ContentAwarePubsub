package dynamicPubsub.generic.publish

import dynamicPubsub.generic.content.{Content, ContentAwareDescription}

class ContentPublisherPredicate[C <: Content](val topicToContentDescription:Map[String,ContentAwareDescription[C]],val emptyDescription:ContentAwareDescription[C]) {
  def test(topic: String, content: C): Boolean={
    topicToContentDescription.getOrElse(topic,emptyDescription).contains(content)
  }
}
