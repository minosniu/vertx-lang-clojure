(ns com.acme.clojure.pkg.my-interface)

(import com.acme.pkg.MyInterface)

(defn create
  ([] (MyInterface/create)))
(defn method
  ([my-interface] (.method my-interface)))
(defn sub
  ([my-interface] (.sub my-interface)))