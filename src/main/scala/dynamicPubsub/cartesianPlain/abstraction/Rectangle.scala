package dynamicPubsub.cartesianPlain.abstraction

import dynamicPubsub.cartesianPlain.CartesianPoint
import dynamicPubsub.generic.content.ContentAbstraction

class Rectangle (var bottomLeft:CartesianPoint, var topRight:CartesianPoint) extends ContentAbstraction[CartesianPoint]{
  import Rectangle._
  if(!(bottomLeft.equals(CartesianPoint.MAX_POINT) && topRight.equals(CartesianPoint.MIN_POINT)) && !bottomLeft.lte(topRight)) {
    val xs = if (bottomLeft.x<topRight.x){
      (bottomLeft.x,topRight.x)
    } else {
      (topRight.x,bottomLeft.x)
    }
    val ys = if (bottomLeft.y<topRight.y){
      (bottomLeft.y,topRight.y)
    } else {
      (topRight.y,bottomLeft.y)
    }
    bottomLeft = new CartesianPoint(xs._1,ys._1)
    topRight = new CartesianPoint(xs._2,ys._2)
  }
  override def contains(c: CartesianPoint): Boolean = bottomLeft.lte(c)  && c.lte(topRight)
  override def getEmptyDescription: ContentAbstraction[CartesianPoint] = emptyRectangle

  override def toString: String = s"$bottomLeft->$topRight"
}
object Rectangle{
  val emptyRectangle = new Rectangle(CartesianPoint.MAX_POINT,CartesianPoint.MIN_POINT)
}
