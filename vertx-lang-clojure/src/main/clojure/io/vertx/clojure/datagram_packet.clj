(ns io.vertx.clojure.datagram-packet)

(import io.vertx.core.datagram.DatagramPacket)

(defn data
  ([datagram-packet ] (.data datagram-packet )))
(defn sender
  ([datagram-packet ] (.sender datagram-packet )))