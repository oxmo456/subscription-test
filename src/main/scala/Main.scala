import com.acme.subscription.agents.{ITunesUpdateSubscriptionData, ITunesSubscriptionAgent}

object Main {

  def main(args: Array[String]) {


    val iTunesSubscriptionAgent = ITunesSubscriptionAgent()


    iTunesSubscriptionAgent.updateUserSubscription(456, ITunesUpdateSubscriptionData("wejfhjhwefj wejfh wejhf"))

  }

}
