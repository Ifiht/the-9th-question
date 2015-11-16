(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main 'the-9th-question.core
   :output-to "out/main.js"})
