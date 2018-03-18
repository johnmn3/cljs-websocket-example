(ns cljs-websocket-example.foo
  (:require [clojure.browser.ws :as ws]))

(def foo 1234)
(def baz 456)

(if (ws/alive?)
  (println "Loaded foo"))
