package com.mate1.subscription

import come.mate1.permissions.Permission

case class Subscription(userId: Long,
                        start: Option[Long],
                        end: Option[Long],
                        permissions: Seq[Permission],
                        typeId: Long,
                        transactionId: Option[Long])
