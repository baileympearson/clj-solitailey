(ns api.routes.session
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(def session-routes 
  (routes
   (DELETE "/" [] "deleting session")
   (POST "/" [] "creating session")))