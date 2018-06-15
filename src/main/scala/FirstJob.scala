import scala.io.Source
import com.twitter.scalding._

class FirstJob(args: Args) extends Job(args) {
  val input = TextLine("data/hello.txt")
  val output = TextLine("target/data/output0.txt")
  input.read.write(output)

  val alice = Source.fromURL("http://www.gutenberg.org/files/11/11.txt").getLines

  TypedPipe.from(alice.toList)
    .flatMap { line => line.split("""\s+""") }
    .groupBy { word => word }
    .size
    .write(TypedTsv("target/data/output0.txt"))
}

