# vertx-lang-clojure
Vert.x Clojure support.

This version has not been submitted to Maven Central, so you need to `mvn install` to use.
See https://github.com/tychobrailleur/vertx-lang-clojure-example for examples of usage.

Known problem: vertx-lang-clojure has a conflict with datomic in netty-transport-native

### How to use?

In vertx-lang-clojure-gen/, run `mvn install` first.

Go back to vertx-lang-clojure/, run `mvn install` subsequently.

Maven (in your pom.xml):
```xml
<dependency>
  <groupId>com.sparcing</groupId>
  <artifactId>vertx-lang-clojure</artifactId>
  <version>4.5.13</version>
</dependency>
```

Leiningen (in your `project.clj`):

```clojure
  :dependencies [[org.clojure/clojure "1.11.4"]
                 [io.vertx/vertx-web "4.5.13"]
                 [com.sparcing/vertx-lang-clojure "4.5.13"]]
```


### Hello from Vert.x!

```clojure
(ns example.server
 (:require [io.vertx.clojure.core.vertx :as vertx]
           [io.vertx.clojure.core.http.http-server :as server]
           [io.vertx.clojure.core.http.http-server-request :as request]
           [io.vertx.clojure.core.http.http-server-response :as response]))

(defn handle-request [req]
  (let [response (request/response req)]
    (-> response
        (response/put-header "content-type" "text/plain")
        (response/end "Hello from Vert.x!"))))

(defn start [vertx]
  (let [http-server (vertx/create-http-server vertx)]
    (-> http-server
        (server/request-handler (vertx/handler handle-request))
        (server/listen 8080))))
```

### Vert.x instance

If you’re embedding Vert.x then you simply create an instance as follows:

```clojure
(ns ...
  (:require [io.vertx.clojure.core.vertx :as vertx]))

;create a vertx instance
(vertx/vertx)
```

### Verticle

Verticle namespace files normally include a start function which is the entry point of verticle deployment.

Here’s an example verticle:
```clojure

;Called when verticle is deployed
(defn start [])

;Optional - called when verticle is undeployed
(defn stop [])
```

When Vert.x deploys the verticle it will call the start method, and when the method has completed the verticle will be considered started.

You can also optionally provide vertx and context parameters. This will be used by developers when the functions are considered pure.

```clojure

;Following functions format are all allowed, pick one.
(defn start [context vertx])
(defn start [vertx context])
(defn start [vertx])
(defn start [context])

;Following functions format are all allowed, pick one.
(defn stop [context vertx])
(defn stop [vertx context])
(defn stop [vertx])
(defn stop [context])

```

### Verticle Deployment

A Clojure verticle can be deployed with `.clj` suffix or `clj:` prefix:

```clojure
(ns example.verticle
  (:require [io.vertx.clojure.core.vertx :as vertx]))

; completion-handler is required to start the verticle
(def my-handler
  (verticle/completion-handler #(println %)))

(defn start [vertx]
  (vertx/deploy-verticle vertx "io.vertx.sample_verticle.clj" my-handler))
;or
(defn start [vertx]
  (vertx/deploy-verticle vertx "clj:io.vertx.sample_verticle" my-handler))
```

;TODO

- [x] Auto-generate thin wrap APIs by using Codegen
- [x] VerticleWrapper of generated APIs(ClojureVerticle for .clj suffix namespaces)
- [x] ClojureVerticleFactory service
- [x] Tests
- [ ] Auto-generate docs by using Docgen
- [ ] Using Codox to generate on-line Clojure documentation
