# ContentAwarePubsub
This is an abstraction for pubsub which is based on an underlying static pubsub infrastructure.
Static pubsub infrastructure contains fixed topics and thereby fixed publishers and fixed subscribers.
This abstraction then provides the ability to publish data to a topic based upon the content of the sent data, and on the other hand
provide the ability to subscribe to multiple topics based on subscribed content, while allowing subscribing and unsubscribing dynamically as the content of the subscriber may change. 
