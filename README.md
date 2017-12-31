# ContentAwarePubsub
This is an abstraction for pubsub which is based on an underlying static pubsub infrastructure.
Static pubsub infrastructure contains fixed topics and thereby fixed publishers and fixed subscribers.
This abstraction then provides the ability to publish data to potentially multiple topics based upon the content of the sent data. On the other hand this abstraction provides the ability to subscribe to multiple topics based on some abstracted subscription content of the subscriber, while allowing subscribing and unsubscribing dynamically as the content of the subscriber may change.

The original need for this abstraction comes from geospatial aware pubsub, where geospatial data is the content and both publishers and subscribers are dynamic. The scenario is described in http://dbgroup.cs.tsinghua.edu.cn/ligl/papers/sigmod2015-location.pdf
