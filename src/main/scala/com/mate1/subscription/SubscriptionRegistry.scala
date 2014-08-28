package com.mate1.subscription

import scala.util.Try

private[subscription] object SubscriptionRegistry {

  def apply(): SubscriptionRegistry = new SubscriptionRegistry

}


private[subscription] class SubscriptionRegistry {

  def updateUserSubscription(subscription: Subscription): Try[Subscription] = {
    //test if the subscription is valid:
    //  - subscription start and end should not overlap
    //  - new subscription start should be greater than the previous subscription end
    //  - ...
    //store the new subscription into the database
    //note that we keep track of all subscriptions changes

    ???
  }

  def retrieveActiveSubscription(userId: Long): Option[Subscription] = {
    //return the current (last) subscription associated with the userId
    ???
  }

  def retrieveSubscriptions(userId: Long): List[Subscription] = {
    //return all the subscriptions associated with the userId
    ???
  }


}
