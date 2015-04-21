
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
        <title>Computers database</title>
        """),format.raw/*13.47*/("""
        """),format.raw/*14.9*/("""<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*14.70*/routes/*14.76*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*14.119*/("""">
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.at("stylesheets/main.css")),format.raw/*16.94*/(""""/> 
    </head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(/*22.27*/routes/*22.33*/.Application.index()),format.raw/*22.53*/("""">
                    Verpleegkunde applicatie
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(/*29.14*/content),format.raw/*29.21*/("""
        """),format.raw/*30.9*/("""</section>
        
    </body>
</html>
"""))}
  }

  def render(content:Html): play.twirl.api.HtmlFormat.Appendable = apply(content)

  def f:((Html) => play.twirl.api.HtmlFormat.Appendable) = (content) => apply(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Apr 21 15:05:58 CEST 2015
                  SOURCE: C:/Users/Vincent/workspace/verpleegkunde-app/app/views/main.scala.html
                  HASH: 4eb63c2ebe5c736c2ffc65784805de2a2945765e
                  MATRIX: 720->1|823->16|851->18|963->601|999->610|1087->671|1102->677|1167->720|1259->785|1274->791|1329->825|1481->950|1496->956|1537->976|1719->1131|1747->1138|1783->1147
                  LINES: 26->1|29->1|31->3|35->13|36->14|36->14|36->14|36->14|38->16|38->16|38->16|44->22|44->22|44->22|51->29|51->29|52->30
                  -- GENERATED --
              */
          