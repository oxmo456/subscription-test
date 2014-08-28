package com.mate1.subscription.engines

import com.mate1.subscription.{Subscription, SubscriptionEngine}
import scala.util.Try

case class ITunesUpdateSubscriptionData(billingReceipt: String)

class ITunesSubscriptionEngine extends SubscriptionEngine[ITunesUpdateSubscriptionData] {
  override protected def processUserSubscriptionUpdate(userId: Long,
                                                       userSubscriptions: List[Subscription],
                                                       data: ITunesUpdateSubscriptionData): Try[Subscription] = {



    ???
  }
}
