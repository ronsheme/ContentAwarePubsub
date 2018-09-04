package dynamicPubsub.generic.content

class ContentTopicPredicate[C <: Content[C]](val topicToContentAbstraction:Map[String,ContentAbstraction[C]], val emptyDescription:ContentAbstraction[C]) {
  def test(topic: String, content: C): Boolean={
    topicToContentAbstraction.getOrElse(topic,emptyDescription).contains(content)
  }

  def test(topic: String, abastraction: ContentAbstraction[C]): Boolean={
    topicToContentAbstraction.getOrElse(topic,emptyDescription).equals(abastraction)
  }
}
