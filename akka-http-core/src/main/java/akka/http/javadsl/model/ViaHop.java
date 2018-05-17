package akka.http.javadsl.model;

import scala.util.Either;

public abstract class ViaHop {
    public abstract String protocolName();
    public abstract String protocolVersion();
    public abstract Either<Authority, String> receivedBy();
}
