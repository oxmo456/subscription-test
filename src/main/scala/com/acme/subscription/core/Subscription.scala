package com.acme.subscription.core

import come.mate1.permissions.Permission

/**
 * @param userId Each subscription is associated with a user
 * @param start Each subscription have a start time (the beginning of the subscription)
 * @param end Each subscription have an end time (when the subscription end)
 * @param permissions A set of permissions associated with this subscription
 * @param agentId Each subscription is created by an Agent
 * @param transactionId Each subscription have an associated Transaction
 */
case class Subscription(userId: Long,
                        start: Long,
                        end: Long,
                        permissions: Seq[Permission],
                        agentId: Long,
                        transactionId: Long) {
  assert(userId != null)
  assert(start != null)
  assert(end != null)
  assert(start <= end)
  assert(permissions != null)
}
