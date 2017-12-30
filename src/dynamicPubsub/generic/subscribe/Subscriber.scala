package dynamicPubsub.generic.subscribe

import dynamicPubsub.generic.content.Event

trait Subscriber {
  def subscribe(topic:String,consumer:Consumer[Event])
}
