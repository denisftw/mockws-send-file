import java.io.File

import mockws.MockWSHelpers
import play.api.http.FileMimeTypes
import play.api.libs.ws.WSClient
import play.api.mvc.Results._
import play.api.test.Helpers._

object WSClientHelper extends MockWSHelpers {
  val wsClient: WSClient = mockws.MockWS {
    case (GET, "http://localhost:9020/file") =>
      Action { _ =>
        import scala.concurrent.ExecutionContext.Implicits.global
        implicit val mimeTypes: FileMimeTypes = ???
        val content = new File("build.sbt")
        Ok.sendFile(content)
      }
  }
}