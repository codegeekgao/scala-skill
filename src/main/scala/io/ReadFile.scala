package io

import java.io.{File, PrintWriter}

import scala.io.{BufferedSource, Source}

/**
  * Scala的io读取
  *
  * @author CodeGeekGao
  * @version Id: ReadFile.java, v 0.1 2018/9/11 9:56 CodeGeekGao Exp $$
  */
object ReadFile {
  def main(args: Array[String]): Unit = {
    val read = new ReadFile()
    val resource: String = "C:\\Users\\DonnieGao\\Desktop\\a.txt"
    val encode = "UTF-8"
    /*   read.readFile(resource, encode)
       println(read.readFileToStr(resource, encode))
       read.write()*/
    read.dir("C:\\Users\\DonnieGao\\Desktop")
  }
}

@SerialVersionUID(12356L) class ReadFile extends Serializable {
  /**
    * 一行行读取文件的内容
    *
    * @param resource 文件路径
    * @param code     文件编码格式
    */
  def readFile(resource: String, code: String): Unit = {
    var source: BufferedSource = null
    try {
      // 获取文件的Source对象，第一个参数是文件的路径，第二个文件的编码格式
      source = Source.fromFile(resource, code)
      val lineIterator = source.getLines()
      while (true) {
        if (lineIterator.hasNext) {
          println(lineIterator.next())
        } else {
          return
        }
      }
    } finally {
      // 释放资源
      source.close()
    }
  }

  /**
    * 将文本文件所有内容作为字符串
    *
    * @param resource 文件路径
    * @param code     文件编码格式
    * @return
    */
  def readFileToStr(resource: String, code: String): String = {
    // 获取文件的Source对象，第一个参数是文件的路径，第二个文件的编码格式
    var source: BufferedSource = null
    try {
      source = Source.fromFile(resource, code)
      source.mkString
    } finally {
      source.close()
    }
  }

  /**
    * Scala写入文借助java的PrintWriter
    */
  def write(): Unit = {
    val out = new PrintWriter("C:\\Users\\DonnieGao\\Desktop\\test.txt")
    for (i <- 0 to 100) out.println(i)
    out.close()
  }

  /**
    * 使用java列举下所有的文件夹
    *
    * @param dir 文件目录
    */
  def dir(dir: String) = {
    val dirFile = new File(dir)
    val arrayFile = dirFile.listFiles()
    for (i <- arrayFile) {
      println(arrayFile.toBuffer)
    }
  }
}
