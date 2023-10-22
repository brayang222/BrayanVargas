package com.brayanvargas.appbv;

import com.brayanvargas.domainbv.*;

public class App {
   public static void main(String[] args) {



      Directo empleado1 = new Directo("Juan", 4840000);
      Vendedor empleado2 = new Vendedor("Julian", 205000, 45510000);
      Freelance empleado3 = new Freelance("Johanna", 71000, 89);
      Vendedor empleado4 = new Vendedor("Carolina", 980000, 35989000);
      Promotor empleado5 = new Promotor("Pedro", 1200, 300, 62);
      Directo empleado6 = new Directo("David", 3975000);
      Freelance empleado7 = new Freelance("Gustavo", 42500, 65);

      System.out.println(empleado1.getEmpleadoBrayan() + " " + empleado1.getSalarioBrayan());
      System.out.println(empleado1.calcularSaludVargas());



   }
}
