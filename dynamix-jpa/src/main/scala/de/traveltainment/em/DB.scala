package de.traveltainment.em

import org.scala_libs.jpa.{ThreadLocalEM, LocalEMF}

/**
 * Created by sergey on 5/25/14.
 */
object DB extends LocalEMF("scalaJpa", false) with ThreadLocalEM {

}
