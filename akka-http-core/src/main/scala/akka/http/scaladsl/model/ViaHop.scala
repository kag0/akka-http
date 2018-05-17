package akka.http.scaladsl.model

import akka.http.impl.util.{ Rendering, ValueRenderable }
import akka.http.scaladsl.model.Uri.Authority
import akka.http.javadsl.{ model ⇒ jm }

case class ViaHop(protocolName: String, protocolVersion: String, receivedBy: Either[Authority, String], comment: Option[String]) extends jm.ViaHop with ValueRenderable {

  private[http] def render[R <: Rendering](r: R): r.type = {
    if (protocolName.nonEmpty) r ~~ s"$protocolName/"
    r ~~ s"$protocolVersion ${receivedBy.fold(_.toString, identity)}"
    comment match {
      case Some(c) ⇒ r ~~ s" $c"
      case None    ⇒ r
    }
  }
}
