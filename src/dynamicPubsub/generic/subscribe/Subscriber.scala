package dynamicPubsub.generic.subscribe

import dynamicPubsub.generic.content.Event

abstract class Subscriber[C,E<:Event[C]](val topic:String,val consumer:E=>Unit) {
  def subscribe()
  def unsubscribe()
}
