package dynamicPubsub.generic.publish

import dynamicPubsub.generic.content.Event

abstract class Publisher[C,E<:Event[C]](val topic:String) {
  def publish(event: E): Unit
}
