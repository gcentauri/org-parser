(ns org-parser.core
  (:require [instaparse.core :as insta]))

(def org (insta/parser (clojure.java.io/resource "org.bnf")))
