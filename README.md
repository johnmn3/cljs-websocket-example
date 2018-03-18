# CLJS WebSocket Example

## Build

Run:

(for the time being, you'll have to clone, build and install this as a dep first: https://github.com/johnmn3/clojurescript.git)

`lein cljsbuild once`

## REPL

Start a REPL with this:

```clojure
clj -Sdeps '{:deps {org.clojure/clojurescript {:git/url "https://github.com/johnmn3/clojurescript.git" :sha "d75d94586b1ab95c157c84c49ae914c4e26f8fc4"}}}' -m cljs.main -re ws -r
 ```

Once that executes, open `index.html` in your browser and *voila*, your REPL is connected
to the browser.
