package dynamicPubsub.generic.subscribe

import dynamicPubsub.generic.content.{Content,Event}

abstract class Subscriber[C<:Content[C],E<:Event[C]](val topic:String) {
  def subscribe(consumer:E=>Unit)
  def unsubscribe()
}
