package dynamicPubsub.cartesianPlain

import dynamicPubsub.generic.content.Event

class CartesianPointEvent(val point:CartesianPoint) extends Event[CartesianPoint]{
  override def getContent: CartesianPoint = point
}
