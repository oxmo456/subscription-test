package com.acme.subscription.core

import scala.util.Try

trait SubscriptionAgent[A] {

  private[this] val userSubscriptionRegistry = UserSubscriptionRegistry()

  final def updateUserSubscription(userId: Long, data: A): Try[Subscription] = {

    val userSubscriptions: List[Subscription] = userSubscriptionRegistry.retrieveUserSubscriptionsHistory(userId)

    //Should we always allow a subscription update
    // - what if a user has a valid subscription created by an Itune Agent and, for some reasons the user is able to
    // subscribe with an other Agent ?

    processUserSubscriptionUpdate(userId, userSubscriptions, data)
      .flatMap(userSubscriptionRegistry.updateUserSubscription(_))

    //what to do if the subscription update was processed by the engine but fail inside the registry ?
    //  - the engine should store each transaction
    //  - with a transaction we must be able to retry updating the registry
  }

  val typeId = this.getClass.hashCode()

  protected def processUserSubscriptionUpdate(userId: Long,
                                              userSubscriptions: List[Subscription],
                                              data: A): Try[Subscription]

}
