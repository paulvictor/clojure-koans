(defproject clojure-koans "0.5.2-SNAPSHOT"
  :description "The Clojure koans."
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [koan-engine "0.2.5"]
                 [cider/cider-nrepl "0.49.0"]]
  :dev-dependencies [[lein-koan "0.1.5"]]
  :profiles {:dev {:dependencies [[lein-koan "0.1.5"]]}}
  :repl-options {:init-ns koan-engine.runner
                 :init ^:displace (do (use '[koan-engine.core]))
                 :nrepl-middleware
                 [cider.nrepl/wrap-apropos
                  cider.nrepl/wrap-classpath
                  cider.nrepl/wrap-clojuredocs
                  cider.nrepl/wrap-complete
                  cider.nrepl/wrap-debug
                  cider.nrepl/wrap-format
                  cider.nrepl/wrap-info
                  cider.nrepl/wrap-inspect
                  cider.nrepl/wrap-log
                  cider.nrepl/wrap-macroexpand
                  cider.nrepl/wrap-ns
                  cider.nrepl/wrap-spec
                  cider.nrepl/wrap-profile
                  cider.nrepl/wrap-refresh
                  cider.nrepl/wrap-reload
                  cider.nrepl/wrap-resource
                  cider.nrepl/wrap-stacktrace
                  cider.nrepl/wrap-test
                  cider.nrepl/wrap-trace
                  cider.nrepl/wrap-out
                  cider.nrepl/wrap-undef
                  cider.nrepl/wrap-version
                  cider.nrepl/wrap-xref]}
  :plugins [[lein-koan "0.1.5"]]
  :main koan-engine.runner/exec)
