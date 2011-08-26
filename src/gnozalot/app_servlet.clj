(ns gnozalot.app_servlet
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use com.gnozalot.cluster.core)
  (:use [appengine-magic.servlet :only [make-servlet-service-method]]))


(defn -service [this request response]
  ((make-servlet-service-method gnozalot-app) this request response))
