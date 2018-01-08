(ns io.vertx.clojure.datagram-socket)

(import io.vertx.core.datagram.DatagramSocket)
(import io.vertx.core.buffer.Buffer)
(import io.vertx.core.Handler)

(defn is-metrics-enabled
  ([datagram-socket ] (.isMetricsEnabled datagram-socket )))
(defn resume
  ([datagram-socket ] (.resume datagram-socket )))
(defn handler
  ([datagram-socket handler] (.handler datagram-socket handler)))
(defn unlisten-multicast-group
  ([datagram-socket multicast-address handler] (.unlistenMulticastGroup datagram-socket multicast-address handler))
  ([datagram-socket multicast-address network-interface source handler] (.unlistenMulticastGroup datagram-socket multicast-address network-interface source handler)))
(defn listen-multicast-group
  ([datagram-socket multicast-address handler] (.listenMulticastGroup datagram-socket multicast-address handler))
  ([datagram-socket multicast-address network-interface source handler] (.listenMulticastGroup datagram-socket multicast-address network-interface source handler)))
(defn block-multicast-group
  ([datagram-socket multicast-address source-to-block handler] (.blockMulticastGroup datagram-socket multicast-address source-to-block handler))
  ([datagram-socket multicast-address network-interface source-to-block handler] (.blockMulticastGroup datagram-socket multicast-address network-interface source-to-block handler)))
(defn listen
  ([datagram-socket port host handler] (.listen datagram-socket port host handler)))
(defn pause
  ([datagram-socket ] (.pause datagram-socket )))
(defn sender
  ([datagram-socket port host] (.sender datagram-socket port host)))
(defn end-handler
  ([datagram-socket end-handler] (.endHandler datagram-socket end-handler)))
(defn local-address
  ([datagram-socket ] (.localAddress datagram-socket )))
(defn send
  ([datagram-socket packet port host handler] (.send datagram-socket packet port host handler))
  ([datagram-socket str port host handler] (.send datagram-socket str port host handler))
  ([datagram-socket str enc port host handler] (.send datagram-socket str enc port host handler)))
(defn close
  ([datagram-socket handler] (.close datagram-socket handler))
  ([datagram-socket ] (.close datagram-socket )))
(defn exception-handler
  ([datagram-socket handler] (.exceptionHandler datagram-socket handler)))