package dynamicPubsub.generic.subscribe

import dynamicPubsub.generic.content.{Content,Event}

abstract class Subscriber[C<:Content,E<:Event[C]](val topic:String,val consumer:E=>Unit) {
  def subscribe()
  def unsubscribe()
}
