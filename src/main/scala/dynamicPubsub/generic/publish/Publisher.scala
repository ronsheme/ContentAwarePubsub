package dynamicPubsub.generic.publish

import dynamicPubsub.generic.content.{Content,Event}

abstract class Publisher[C<:Content,E<:Event[C]](val topic:String) {
  def publish(event: E): Unit
}
