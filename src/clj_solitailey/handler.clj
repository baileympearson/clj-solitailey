(ns clj-solitailey.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [api.index :refer [api-routes]]))

(defroutes app-routes
  (context "/v1" [] api-routes)
  (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes (assoc-in site-defaults [:security :anti-forgery] false)))