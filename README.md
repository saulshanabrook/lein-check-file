# `lein-check-file`

A Leiningen plugin that prints errors encountered when loading a file.

It's output is in the form `<line number> <error message>` if it encounters
an error.

## Usage

Put `[lein-check-file "0.1.0"]` into the `:plugins` vector of your `:user`
profile.

```bash
$ lein check-file src/good-file.clj
# no output on good file
$ cat src/bad-file.clj
(ns whafd
  ssadf)
$ lein check-file src/bad-file.clj
1 Don't know how to create ISeq from: clojure.lang.Symbol
```
