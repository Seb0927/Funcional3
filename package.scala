package object Canicas {
  /**
   * Objeto del tipo frasco
   * Int: Identificador frasco
   * Int: Número de canicas dentro de este
   */
  type Frasco = (Int, Int)

  /**
   * Objeto del tipo Lista de frascos
   * Frasco: Objetos del tipo Frasco
   */
  type Distr = List[Frasco]

  //Funciones

  /**
   * Devuelve la lista de posibles configuraciones del frasco f.
   * @param f Identificador del frasco.
   * @param c Número máximo de canicas.
   * @return List[Frasco] Lista de posibles configuraciones del frasco f.
   */
  def canicasPosiblesFrasco(f:Int, c:Int):List[Frasco] = {
    //Para cada cantidad de canicas del rango (0 to c), agrege la pareja (f,canica) a lo que se retorna.
    for {
      canica <- (0 to c).toList
    } yield (f,canica)
  }

  /**
   * Devuelve la lista de canicas posibles por cada frasco.
   * @param n Número de frascos.
   * @param c Número máximo de canicas.
   * @return
   */
  def canicasPorFrasco(n:Int, c:Int):List[Distr] = {
    //Por cada frasco del rango (1 to n), agregue la lista resultante de canicasPosiblesFrasco(frasco,c)
    for {
      frasco <- (1 to n).toList
    } yield canicasPosiblesFrasco(frasco,c)
  }


  /**
   * Devuelve la lista de todas las combinaciones posibles de canicas del frasco "1" hasta el frasco "n".
   * @param lc Lista de canicas posibles por frasco.
   * @return Lista de todas las combinaciones posibles de canicas del frasco "1", "2", ..., con canicas del frasco "n".
   */
  def mezclarLCanicas(lc:List[Distr]):List[Distr] = {

    val canicasMax = lc.head.last._2
    val frascosMax = lc.last.head._1

    for {

    }

    /*
    if (lc.tail.isEmpty){
      return lc
    } else {
      for {
        x <- lc.head
      } yield ()mezclarLCanicas(lc.tail)
    }

     */


    /*
    for {
      x <- (0 to canicas).toList
      y <- (1 to frascos).toList
    } yield List((x,y),(x,y),(x,y))

     */



    /*
        CORRECTA PARCIALMENTE
        for {
          x <- lc.head
          y <- lc.tail.head
          z <- lc.tail.tail.head
        } yield List(x,y,z)

         */

    /*
    if (lc.tail.isEmpty) {
      return lc
    } else {
      for {
        x <- lc.head //1,0 1,1
        y <- mezclarLCanicas(lc.tail) //2,0 - 2,1
      } yield (x, y) //x, y
    }

     */

    /*
    for {
      x <- lc.head
      y <- mezclarLCanicas(lc.tail)
    } yield (x,y)

     */

    /*
    if (lc.tail.isEmpty) {
      return lc
    } else {
      for {
        x <- lc.head
      } yield (x, mezclarLCanicas(lc.tail))
    }

     */

    /*
    if (lc.tail.isEmpty){
      return lc
    } else {
      for {
        x <- lc.head
      } yield(x, mezclarLCanicas(lc.tail))
    }

     */




    /*
    for {
      x <- (1 to lc.size).toList
      y <- (0 to lc.head.size).toList
    } yield (x,y)

     */

    /*
    for {
      listaUltima <- lc.last
    } yield(lc.head, lc.last)
    //List[(Distr, Distr)]
     */

    /*
    for {
      canicasPosibles <- lc
      if (!lc.tail.isEmpty)
    } yield for {
      canicasPosibles <- lc.tail
    }

     */

    /*
    for {
      listaPrimera <- lc.head
      listaUltima <- lc.last
    } yield(List(listaPrimera, listaUltima))

     */


  }




//Comentarios míos (Ignorar)
  //Realiza un rango de 0 hasta "c" y map realiza a cada elemento de ese rango un frasco (f,x)
  //return (0 to c).map(x => (f,x)).toList

  //Realiza un rango de 1 hasta "n" y map introduce cada elemento de ese rango a la función "canicasPosiblesFrasco"
  //con (x,c)
  //(1 to n).map(x => canicasPosiblesFrasco(x,c)).toList


}
