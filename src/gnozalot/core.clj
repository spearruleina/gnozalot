(ns com.gnozalot.cluster.core
  (:use compojure.core)
  (:use hiccup.core)
  (:require [appengine-magic.core :as ae]
            [compojure.route :as route]))
;            [appengine-clj.users :as users]))

;; Causes problems w/GAE devserver!!
;; (:require [compojure.handler :as handler]))



;(defn guestbook [req]
;  ())

(defroutes gnozalot-app-handler
  (GET "/fuck" [] (html [:h1 "Hello, Fucker!"]))
  (route/not-found (html [:h1 "Page not found (,Idiot)"]
                         [:p [:a {:href "/fuck"} "Learn some things?"]])))

(ae/def-appengine-app gnozalot-app #'gnozalot-app-handler)
