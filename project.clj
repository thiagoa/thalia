(defproject thalia "0.2.0-SNAPSHOT"
  :description "Documentation for Clojure functions, macros, protocols, vars"
  :url "http://github.com/jafingerhut/thalia"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :profiles {:dev {:dependencies [[cheshire "5.0.2"]
                                  [me.raynes/fs "1.4.3"]
                                  [org.clojure/core.memoize "0.5.7"]

                                  ;; 3rd party Clojure collection libs
                                  ;;[org.clojure/data.avl "0.0.17"]
                                  [org.clojure/data.avl "0.0.18-SNAPSHOT"]
                                  ;;[org.clojure/data.int-map "0.2.4"]
                                  [org.clojure/data.int-map "0.2.5-SNAPSHOT"]
                                  ;;[org.clojure/data.priority-map "0.0.9"]
                                  [org.clojure/data.priority-map "0.0.10-SNAPSHOT"]
                                  ;;[org.flatland/ordered "1.5.6"]
                                  [org.flatland/ordered "1.5.7-SNAPSHOT"]
                                  [org.flatland/useful "0.11.5"]
                                  ]
                   ;; The following line interferes with creating
                   ;; small JAR files via 'lein install/jar/deploy',
                   ;; so only include it in the dev profile.
                   :main thalia.core}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :1.9 {:dependencies [[org.clojure/clojure "1.9.0"]]}}
  :aliases {"test-all" ["with-profile" "dev,1.5:dev,1.6:dev,1.7:dev,1.8:dev,1.9" "test"]}
  :repl-options {:init-ns user}
  :resource-paths ["resource"])
