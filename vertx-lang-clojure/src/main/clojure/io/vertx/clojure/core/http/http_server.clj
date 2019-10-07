(ns io.vertx.clojure.core.http.http-server)

(import io.vertx.core.Handler)
(import io.vertx.core.http.HttpServer)
(import io.vertx.core.net.SocketAddress)

(defn actual-port
  ([http-server] (.actualPort http-server)))
(defn close
  ([http-server] (.close http-server))
  ([http-server completion-handler] (.close http-server completion-handler)))
(defn connection-handler
  ([http-server handler] (.connectionHandler http-server handler)))
(defn exception-handler
  ([http-server handler] (.exceptionHandler http-server handler)))
(defn is-metrics-enabled
  ([http-server] (.isMetricsEnabled http-server)))
(defn listen
  ([http-server] (.listen http-server))
  ([http-server address-or-port listen-handler-or-host] (.listen http-server address-or-port listen-handler-or-host))
  ([http-server port host listen-handler] (.listen http-server port host listen-handler))
  ([http-server listen-handler-or-port] (.listen http-server listen-handler-or-port)))
(defn request-handler
  ([http-server handler] (.requestHandler http-server handler)))
(defn request-stream
  ([http-server] (.requestStream http-server)))
(defn websocket-handler
  ([http-server handler] (.websocketHandler http-server handler)))
(defn websocket-stream
  ([http-server] (.websocketStream http-server)))
(defn handler [f]
  (reify
   io.vertx.core.Handler
   (handle [this para]
           (f para))))