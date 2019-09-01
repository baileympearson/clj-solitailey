(ns api.routes.game
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(def game-routes 
  (routes 
   (GET "/:game-id" [game-id] (str "Fetching data for " game-id))
   (HEAD "/:game-id" [game-id] "HEAD game-id")
   (POST "/" [] "Creating a new game")
   (PUT "/:game-id" [game-id] "editing a user")))
