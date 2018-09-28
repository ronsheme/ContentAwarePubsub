package dynamicPubsub.cartesianPlane

import dynamicPubsub.generic.content.Content

class CartesianPoint(val x: Integer, val y:Integer) extends Content[CartesianPoint]{
  def lte(other:CartesianPoint):Boolean = x<=other.x && y<=other.y

  def canEqual(a: Any): Boolean = a.isInstanceOf[CartesianPoint]

  override def equals(that: Any): Boolean =
    that match {
      case that: CartesianPoint => that.canEqual(this) && this.hashCode == that.hashCode
      case _ => false
    }

  override def hashCode: Int = {
    val prime = 31
    var result = prime + x
    result = prime * result + y
    result
  }

  override def toString: String = s"($x,$y)"
}

object CartesianPoint{
  val MAX_POINT = new CartesianPoint(Integer.MAX_VALUE,Integer.MAX_VALUE)
  val MIN_POINT = new CartesianPoint(Integer.MIN_VALUE,Integer.MIN_VALUE)
}

