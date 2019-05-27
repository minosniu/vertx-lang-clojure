(ns io.vertx.clojure.core.deployment-options)

(import io.vertx.core.DeploymentOptions)
(import io.vertx.core.json.JsonObject)

(defn new-instance
  ([] (new DeploymentOptions))
  ([^JsonObject json] (new DeploymentOptions json)))

(defn set-config [^DeploymentOptions deployment-options config] (.setConfig deployment-options config))
(defn get-config [^DeploymentOptions deployment-options] (.getConfig deployment-options))
(defn set-extra-classpath [^DeploymentOptions deployment-options extra-classpath] (.setExtraClasspath deployment-options extra-classpath))
(defn get-extra-classpath [^DeploymentOptions deployment-options] (.getExtraClasspath deployment-options))
(defn set-ha [^DeploymentOptions deployment-options ha] (.setHa deployment-options ha))
(defn is-ha [^DeploymentOptions deployment-options] (.isHa deployment-options))
(defn set-instances [^DeploymentOptions deployment-options instances] (.setInstances deployment-options instances))
(defn get-instances [^DeploymentOptions deployment-options] (.getInstances deployment-options))
(defn set-isolated-classes [^DeploymentOptions deployment-options isolated-classes] (.setIsolatedClasses deployment-options isolated-classes))
(defn get-isolated-classes [^DeploymentOptions deployment-options] (.getIsolatedClasses deployment-options))
(defn set-isolation-group [^DeploymentOptions deployment-options isolation-group] (.setIsolationGroup deployment-options isolation-group))
(defn get-isolation-group [^DeploymentOptions deployment-options] (.getIsolationGroup deployment-options))
(defn set-max-worker-execute-time [^DeploymentOptions deployment-options max-worker-execute-time] (.setMaxWorkerExecuteTime deployment-options max-worker-execute-time))
(defn get-max-worker-execute-time [^DeploymentOptions deployment-options] (.getMaxWorkerExecuteTime deployment-options))
(defn set-max-worker-execute-time-unit [^DeploymentOptions deployment-options max-worker-execute-time-unit] (.setMaxWorkerExecuteTimeUnit deployment-options max-worker-execute-time-unit))
(defn get-max-worker-execute-time-unit [^DeploymentOptions deployment-options] (.getMaxWorkerExecuteTimeUnit deployment-options))
(defn set-multi-threaded [^DeploymentOptions deployment-options multi-threaded] (.setMultiThreaded deployment-options multi-threaded))
(defn is-multi-threaded [^DeploymentOptions deployment-options] (.isMultiThreaded deployment-options))
(defn set-worker [^DeploymentOptions deployment-options worker] (.setWorker deployment-options worker))
(defn is-worker [^DeploymentOptions deployment-options] (.isWorker deployment-options))
(defn set-worker-pool-name [^DeploymentOptions deployment-options worker-pool-name] (.setWorkerPoolName deployment-options worker-pool-name))
(defn get-worker-pool-name [^DeploymentOptions deployment-options] (.getWorkerPoolName deployment-options))
(defn set-worker-pool-size [^DeploymentOptions deployment-options worker-pool-size] (.setWorkerPoolSize deployment-options worker-pool-size))
(defn get-worker-pool-size [^DeploymentOptions deployment-options] (.getWorkerPoolSize deployment-options))
(defn to-json [^DeploymentOptions deployment-options] (.toJson deployment-options))