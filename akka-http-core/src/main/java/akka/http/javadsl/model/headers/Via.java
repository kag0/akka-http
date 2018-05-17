package akka.http.javadsl.model.headers;

import akka.http.javadsl.model.ViaHop;

/**
 *  Model for the `Via` header.
 *  Specification: https://tools.ietf.org/html/rfc2616#section-14.45
 */
public abstract class Via extends akka.http.scaladsl.model.HttpHeader {
    public abstract Iterable<ViaHop> getHops();
}
