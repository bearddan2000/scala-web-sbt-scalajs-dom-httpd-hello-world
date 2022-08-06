# scala-web-sbt-scalajs-dom-httpd-hello-world

## Description
POC for scalajs. Uses Docker
multi stage build. Writes directly
to the DOM.

## Tech stack
- multi stage build
- scala
- sbt
  - scalajs

## Docker stack
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10
- httpd:latest

## To run
`sudo ./install.sh -u`
- [Availble here](http://localhost)
- Look at web console for output

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`
