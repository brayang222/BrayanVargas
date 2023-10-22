package com.brayanvargas.domainbv;

public class Directo extends Empleado{
   private long salarioBrayan;

   public Directo(String nombreBrayan, long salarioBrayan) {
      super(String.valueOf(nombreBrayan));
      this.salarioBrayan = salarioBrayan;
   }

   public long calcularSaludVargas(){
      return (long) (salarioBrayan - 0.05 * salarioBrayan);
   }

   public long calcularPensionVargas(){
      return (long) (salarioBrayan - 0.065 * salarioBrayan);
   }

   public long getSalarioBrayan() {
      return salarioBrayan;
   }

   public void setSalarioBrayan(long salarioBrayan) {
      this.salarioBrayan = salarioBrayan;
   }
}
