(ns api.routes.user
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            ))

(def user-routes 
  (routes 
   (GET "/:username" [username] (str "Fetching data for " username))
   (HEAD "/:username" [username] "HEAD username")
   (POST "/" [] "Creating a new user")
   (PUT "/:username" [username] "editing a user")))
