(defproject gnozalot "1.0.0-SNAPSHOT"
  :description "Guestbook test app"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [compojure "0.6.4"]
                 [hiccup "0.3.6"]]
  :dev-dependencies [[swank-clojure "1.2.1"]
;                     [lein-ring "0.4.5"]
                     [appengine-magic "0.4.4"]])
 ; :ring {:handler gnozalot.core/gnozalot-app})
