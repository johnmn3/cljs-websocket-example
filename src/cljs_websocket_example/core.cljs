(ns cljs-websocket-example.core
  (:require [clojure.browser.ws :as ws]
            [cljs-websocket-example.foo :as foo :refer [baz]]))

(when-not (ws/alive?)
  (ws/connect "ws://localhost:9001"))

(if (ws/alive?)
  (println "Loaded example"))

foo/foo

(ws/alive?)
