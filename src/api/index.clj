(ns api.index
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [api.routes.user :as user]
            [api.routes.game :as game]
            [api.routes.session :as session]))

(def api-routes
  (routes
   (context "/user" [] user/user-routes)
   (context "/game" [] game/game-routes)
   (context "/session" [] session/session-routes)))