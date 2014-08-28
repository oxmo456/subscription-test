package com.mate1.subscription.core

import scala.util.Try

trait SubscriptionEngine[A] {

  private[this] val subscriptionRegistry = SubscriptionRegistry()

  final def updateUserSubscription(userId: Long, data: A): Try[Subscription] = {

    val userSubscriptions: List[Subscription] = subscriptionRegistry.retrieveSubscriptions(userId)

    processUserSubscriptionUpdate(userId, userSubscriptions, data)
      .flatMap(subscriptionRegistry.updateUserSubscription(_))

    //what to do if the subscription update was processed by the engine but fail inside the registry ?
    //  - the engine should store each transaction
    //  - with a transaction we must be able to retry updating the registry
  }

  val typeId = this.getClass.hashCode()

  protected def processUserSubscriptionUpdate(userId: Long,
                                              userSubscriptions: List[Subscription],
                                              data: A): Try[Subscription]

}
