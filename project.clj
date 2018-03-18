(defproject cljs-websocket-example "0.0.1"
  :description "example project for the WebSocket ClojureScript REPL env"
  :dependencies [[org.clojure/clojure "1.10.0-alpha4"]
                 [org.clojure/clojurescript "1.10.202"]]
  :source-paths ["src"]
  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.2.2-SNAPSHOT"]
                                  [org.clojure/tools.nrepl "0.2.12"]]
                   :plugins [[lein-cljsbuild "1.1.7"]]
                   :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
                   :cljsbuild {:builds [{:id "cljs-websocket-example"
                                         :source-paths ["src"]
                                         :compiler {:output-to "out/cljs_websocket_example.js"
                                                    :output-dir "out"
                                                    :optimizations :none
                                                    :source-map true}}]}}})
