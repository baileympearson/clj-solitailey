(ns clj-solitailey.handler-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [clj-solitailey.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (app (mock/request :post "/v1/session"))]
      (is (= (:status response) 200))
      (is (= (:body response) "creating session"))))

  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))
