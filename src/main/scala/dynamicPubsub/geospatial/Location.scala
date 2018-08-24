package dynamicPubsub.geospatial

import dynamicPubsub.generic.content.Content

class Location (val longitude: Double,val latitude:Double) extends Content[Location]{
  def lte(other:Location):Boolean = longitude<=other.longitude && latitude<=other.latitude
}
