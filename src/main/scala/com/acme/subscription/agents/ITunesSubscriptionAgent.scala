package com.acme.subscription.agents

import scala.util.Try
import com.acme.subscription.core.{SubscriptionAgent, Subscription}

case class ITunesUpdateSubscriptionData(billingReceipt: String)

object ITunesSubscriptionAgent {

  def apply(): ITunesSubscriptionAgent = new ITunesSubscriptionAgent

}

class ITunesSubscriptionAgent extends SubscriptionAgent[ITunesUpdateSubscriptionData] {
  override protected def processUserSubscriptionUpdate(userId: Long,
                                                       userSubscriptions: List[Subscription],
                                                       data: ITunesUpdateSubscriptionData): Try[Subscription] = {


    ???
  }
}


