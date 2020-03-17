(ns io.vertx.clojure.core.net.net-server-options)

(import io.vertx.core.net.NetServerOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new NetServerOptions))
  ([^JsonObject json] (new NetServerOptions json)))

(defn set-accept-backlog [^NetServerOptions net-server-options accept-backlog] (.setAcceptBacklog net-server-options accept-backlog))
(defn get-accept-backlog [^NetServerOptions net-server-options] (.getAcceptBacklog net-server-options))
(defn set-client-auth [^NetServerOptions net-server-options client-auth] (.setClientAuth net-server-options client-auth))
(defn get-client-auth [^NetServerOptions net-server-options] (.getClientAuth net-server-options))
(defn add-crl-path [^NetServerOptions net-server-options crl-paths] (.addCrlPath net-server-options crl-paths))
(defn get-crl-paths [^NetServerOptions net-server-options] (.getCrlPaths net-server-options))
(defn add-crl-value [^NetServerOptions net-server-options crl-values] (.addCrlValue net-server-options crl-values))
(defn get-crl-values [^NetServerOptions net-server-options] (.getCrlValues net-server-options))
(defn add-enabled-cipher-suite [^NetServerOptions net-server-options enabled-cipher-suites] (.addEnabledCipherSuite net-server-options enabled-cipher-suites))
(defn get-enabled-cipher-suites [^NetServerOptions net-server-options] (.getEnabledCipherSuites net-server-options))
(defn add-enabled-secure-transport-protocol [^NetServerOptions net-server-options enabled-secure-transport-protocols] (.addEnabledSecureTransportProtocol net-server-options enabled-secure-transport-protocols))
(defn set-enabled-secure-transport-protocols [^NetServerOptions net-server-options enabled-secure-transport-protocols] (.setEnabledSecureTransportProtocols net-server-options enabled-secure-transport-protocols))
(defn get-enabled-secure-transport-protocols [^NetServerOptions net-server-options] (.getEnabledSecureTransportProtocols net-server-options))
(defn set-host [^NetServerOptions net-server-options host] (.setHost net-server-options host))
(defn get-host [^NetServerOptions net-server-options] (.getHost net-server-options))
(defn set-idle-timeout [^NetServerOptions net-server-options idle-timeout] (.setIdleTimeout net-server-options idle-timeout))
(defn get-idle-timeout [^NetServerOptions net-server-options] (.getIdleTimeout net-server-options))
(defn set-idle-timeout-unit [^NetServerOptions net-server-options idle-timeout-unit] (.setIdleTimeoutUnit net-server-options idle-timeout-unit))
(defn get-idle-timeout-unit [^NetServerOptions net-server-options] (.getIdleTimeoutUnit net-server-options))
(defn set-jdk-ssl-engine-options [^NetServerOptions net-server-options jdk-ssl-engine-options] (.setJdkSslEngineOptions net-server-options jdk-ssl-engine-options))
(defn get-jdk-ssl-engine-options [^NetServerOptions net-server-options] (.getJdkSslEngineOptions net-server-options))
(defn set-key-cert-options [^NetServerOptions net-server-options key-cert-options] (.setKeyCertOptions net-server-options key-cert-options))
(defn set-key-store-options [^NetServerOptions net-server-options key-store-options] (.setKeyStoreOptions net-server-options key-store-options))
(defn get-key-store-options [^NetServerOptions net-server-options] (.getKeyStoreOptions net-server-options))
(defn set-log-activity [^NetServerOptions net-server-options log-activity] (.setLogActivity net-server-options log-activity))
(defn get-log-activity [^NetServerOptions net-server-options] (.getLogActivity net-server-options))
(defn set-open-ssl-engine-options [^NetServerOptions net-server-options open-ssl-engine-options] (.setOpenSslEngineOptions net-server-options open-ssl-engine-options))
(defn get-open-ssl-engine-options [^NetServerOptions net-server-options] (.getOpenSslEngineOptions net-server-options))
(defn set-pem-key-cert-options [^NetServerOptions net-server-options pem-key-cert-options] (.setPemKeyCertOptions net-server-options pem-key-cert-options))
(defn get-pem-key-cert-options [^NetServerOptions net-server-options] (.getPemKeyCertOptions net-server-options))
(defn set-pem-trust-options [^NetServerOptions net-server-options pem-trust-options] (.setPemTrustOptions net-server-options pem-trust-options))
(defn get-pem-trust-options [^NetServerOptions net-server-options] (.getPemTrustOptions net-server-options))
(defn set-pfx-key-cert-options [^NetServerOptions net-server-options pfx-key-cert-options] (.setPfxKeyCertOptions net-server-options pfx-key-cert-options))
(defn get-pfx-key-cert-options [^NetServerOptions net-server-options] (.getPfxKeyCertOptions net-server-options))
(defn set-pfx-trust-options [^NetServerOptions net-server-options pfx-trust-options] (.setPfxTrustOptions net-server-options pfx-trust-options))
(defn get-pfx-trust-options [^NetServerOptions net-server-options] (.getPfxTrustOptions net-server-options))
(defn set-port [^NetServerOptions net-server-options port] (.setPort net-server-options port))
(defn get-port [^NetServerOptions net-server-options] (.getPort net-server-options))
(defn set-receive-buffer-size [^NetServerOptions net-server-options receive-buffer-size] (.setReceiveBufferSize net-server-options receive-buffer-size))
(defn get-receive-buffer-size [^NetServerOptions net-server-options] (.getReceiveBufferSize net-server-options))
(defn set-reuse-address [^NetServerOptions net-server-options reuse-address] (.setReuseAddress net-server-options reuse-address))
(defn is-reuse-address [^NetServerOptions net-server-options] (.isReuseAddress net-server-options))
(defn set-reuse-port [^NetServerOptions net-server-options reuse-port] (.setReusePort net-server-options reuse-port))
(defn is-reuse-port [^NetServerOptions net-server-options] (.isReusePort net-server-options))
(defn set-send-buffer-size [^NetServerOptions net-server-options send-buffer-size] (.setSendBufferSize net-server-options send-buffer-size))
(defn get-send-buffer-size [^NetServerOptions net-server-options] (.getSendBufferSize net-server-options))
(defn set-sni [^NetServerOptions net-server-options sni] (.setSni net-server-options sni))
(defn is-sni [^NetServerOptions net-server-options] (.isSni net-server-options))
(defn set-so-linger [^NetServerOptions net-server-options so-linger] (.setSoLinger net-server-options so-linger))
(defn get-so-linger [^NetServerOptions net-server-options] (.getSoLinger net-server-options))
(defn set-ssl [^NetServerOptions net-server-options ssl] (.setSsl net-server-options ssl))
(defn is-ssl [^NetServerOptions net-server-options] (.isSsl net-server-options))
(defn set-ssl-engine-options [^NetServerOptions net-server-options ssl-engine-options] (.setSslEngineOptions net-server-options ssl-engine-options))
(defn get-ssl-engine-options [^NetServerOptions net-server-options] (.getSslEngineOptions net-server-options))
(defn set-ssl-handshake-timeout [^NetServerOptions net-server-options ssl-handshake-timeout] (.setSslHandshakeTimeout net-server-options ssl-handshake-timeout))
(defn get-ssl-handshake-timeout [^NetServerOptions net-server-options] (.getSslHandshakeTimeout net-server-options))
(defn set-ssl-handshake-timeout-unit [^NetServerOptions net-server-options ssl-handshake-timeout-unit] (.setSslHandshakeTimeoutUnit net-server-options ssl-handshake-timeout-unit))
(defn get-ssl-handshake-timeout-unit [^NetServerOptions net-server-options] (.getSslHandshakeTimeoutUnit net-server-options))
(defn set-tcp-cork [^NetServerOptions net-server-options tcp-cork] (.setTcpCork net-server-options tcp-cork))
(defn is-tcp-cork [^NetServerOptions net-server-options] (.isTcpCork net-server-options))
(defn set-tcp-fast-open [^NetServerOptions net-server-options tcp-fast-open] (.setTcpFastOpen net-server-options tcp-fast-open))
(defn is-tcp-fast-open [^NetServerOptions net-server-options] (.isTcpFastOpen net-server-options))
(defn set-tcp-keep-alive [^NetServerOptions net-server-options tcp-keep-alive] (.setTcpKeepAlive net-server-options tcp-keep-alive))
(defn is-tcp-keep-alive [^NetServerOptions net-server-options] (.isTcpKeepAlive net-server-options))
(defn set-tcp-no-delay [^NetServerOptions net-server-options tcp-no-delay] (.setTcpNoDelay net-server-options tcp-no-delay))
(defn is-tcp-no-delay [^NetServerOptions net-server-options] (.isTcpNoDelay net-server-options))
(defn set-tcp-quick-ack [^NetServerOptions net-server-options tcp-quick-ack] (.setTcpQuickAck net-server-options tcp-quick-ack))
(defn is-tcp-quick-ack [^NetServerOptions net-server-options] (.isTcpQuickAck net-server-options))
(defn set-traffic-class [^NetServerOptions net-server-options traffic-class] (.setTrafficClass net-server-options traffic-class))
(defn get-traffic-class [^NetServerOptions net-server-options] (.getTrafficClass net-server-options))
(defn set-trust-options [^NetServerOptions net-server-options trust-options] (.setTrustOptions net-server-options trust-options))
(defn get-trust-options [^NetServerOptions net-server-options] (.getTrustOptions net-server-options))
(defn set-trust-store-options [^NetServerOptions net-server-options trust-store-options] (.setTrustStoreOptions net-server-options trust-store-options))
(defn get-trust-store-options [^NetServerOptions net-server-options] (.getTrustStoreOptions net-server-options))
(defn set-use-alpn [^NetServerOptions net-server-options use-alpn] (.setUseAlpn net-server-options use-alpn))
(defn is-use-alpn [^NetServerOptions net-server-options] (.isUseAlpn net-server-options))
(defn to-json [^NetServerOptions net-server-options] (.toJson net-server-options))