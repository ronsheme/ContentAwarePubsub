package dynamicPubsub.cartesianPlain.abstraction

import dynamicPubsub.cartesianPlain.CartesianPoint
import org.scalatest.FlatSpec

class RectangleTest extends FlatSpec {

  "emptyRectangle" should " not contain (0,0)" in{
    assert(!Rectangle.emptyRectangle.contains(new CartesianPoint(0,0)))
  }

  it should "not contain (Integer.MAX_VALUE,Integer.MAX_VALUE)" in{
    assert(!Rectangle.emptyRectangle.contains(CartesianPoint.MAX_POINT))
  }

  it should "not contain (Integer.MIN_VALUE,Integer.MIN_VALUE)" in{
    assert(!Rectangle.emptyRectangle.contains(CartesianPoint.MIN_POINT))
  }

  it should "not contain (-Integer.MIN_VALUE,-Integer.MIN_VALUE)" in{
    assert(!Rectangle.emptyRectangle.contains(new CartesianPoint(-Integer.MIN_VALUE,-Integer.MIN_VALUE)))
  }

  it should "not contain (-Integer.MAX_VALUE,-Integer.MAX_VALUE)" in{
    assert(!Rectangle.emptyRectangle.contains(new CartesianPoint(-Integer.MAX_VALUE,-Integer.MAX_VALUE)))
  }

  "[(1,1),(3,3)]" should "contain (2,2)" in{
    assert(new Rectangle(new CartesianPoint(1,1),new CartesianPoint(3,3)).contains(new CartesianPoint(2,2)))
  }

  "[(3,3),(1,1)]" should "become [(1,1),(3,3)]" in {
    val point1= new CartesianPoint(1,1)
    val point3 = new CartesianPoint(3,3)
    val rectangle = new Rectangle(point3,point1)
    assert(rectangle.bottomLeft == point1 && rectangle.topRight == point3)
  }
}
