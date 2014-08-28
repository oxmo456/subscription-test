package com.mate1.subscription.engines

import scala.util.Try
import com.mate1.subscription.core.{SubscriptionEngine, Subscription}

case class ITunesUpdateSubscriptionData(billingReceipt: String)

class ITunesSubscriptionEngine extends SubscriptionEngine[ITunesUpdateSubscriptionData] {
  override protected def processUserSubscriptionUpdate(userId: Long,
                                                       userSubscriptions: List[Subscription],
                                                       data: ITunesUpdateSubscriptionData): Try[Subscription] = {


    ???
  }
}
