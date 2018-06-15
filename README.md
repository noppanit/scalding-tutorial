## A missing guide for Scalding

As I started using Scalding more, I feel like it's hard to just get a simple job up and running on my local machine.
I had to google a lot and I would like to sum it up in this repository so anyone stumbled upon this doc would find it beneficial.

This documentation won't explain anything about Scalding since the [Wiki](https://github.com/twitter/scalding/wiki) explains it really well.

## How to get started

1. Install Scala `brew install scala`
2. Install sbt `brew install sbt`
3. `git clone https://github.com/noppanit/scalding-tutorial.git`
4. Install Java 8


## How to get started with Intellij

1. Install [SBT plugin](https://plugins.jetbrains.com/plugin/5007-sbt)
2. Install [Scala plugin](https://plugins.jetbrains.com/plugin/1347-scala)

Intellij should popup a dialog for you to import dependencies from SBT

## How to run the FirstJob

1. You can follow this [step](https://github.com/twitter/scalding/wiki/Run-in-Intellij-IDEA)

What's missing from that step is you need to have `"org.apache.hadoop" % "hadoop-core" % "1.2.1"` as a dependency. Otherwise, `Tool` will complain that it's missing Main class

Your `Edit Configurations` should look like this

![screen shot 2018-06-15 at 4 18 40 pm](https://user-images.githubusercontent.com/638379/41487748-ce475e9c-70b7-11e8-92f1-a7a1da851dbd.png)

You can try and click `Run` It should spits out the word count of Alice in Wonder Land in folder `target/data/output0.txt`

Have fun!

