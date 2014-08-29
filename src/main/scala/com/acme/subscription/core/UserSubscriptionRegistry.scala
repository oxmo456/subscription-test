package com.acme.subscription.core

import scala.util.Try

object UserSubscriptionRegistry {

  private[core] def apply(): UserSubscriptionRegistry = new UserSubscriptionRegistry

  def retrieveActiveUserSubscription(userId: Long): Option[Subscription] = {
    //return the current (last) subscription associated with the userId
    ???
  }

  def retrieveUserSubscriptionsHistory(userId: Long): List[Subscription] = {
    //return all the subscriptions associated with the userId
    ???
  }

}


private[core] class UserSubscriptionRegistry {

  def updateUserSubscription(subscription: Subscription): Try[Subscription] = {
    //test if the subscription is valid:
    //  - subscription start and end should not overlap
    //  - new subscription start should be greater than the previous subscription end
    //  - ...
    //store the new subscription into the database
    //note that we keep track of all subscriptions changes

    ???
  }

  def retrieveActiveUserSubscription(userId: Long): Option[Subscription] = UserSubscriptionRegistry
    .retrieveActiveUserSubscription(userId)

  def retrieveUserSubscriptionsHistory(userId: Long): List[Subscription] = UserSubscriptionRegistry.retrieveUserSubscriptionsHistory(userId)

}
