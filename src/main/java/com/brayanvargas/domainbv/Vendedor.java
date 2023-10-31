package com.brayanvargas.domainbv;

public class Vendedor extends Directo{
   private long ventasDelMesBrayan;

   public Vendedor(String nombreBrayan, long salarioBrayan, long ventasDelMesBrayan) {
      super(nombreBrayan, salarioBrayan);
      this.ventasDelMesBrayan = ventasDelMesBrayan;
   }

   @Override
   public Long calcularSalarioVargas() {
      return getSalarioBrayan() + calcularComisionVargas();
   }

   public long calcularComisionVargas(){
      long comision = 0;
      if (getSalarioBrayan() < 999999){
         comision = (long) ((ventasDelMesBrayan * 0.04));
      } else {
         comision = (long) ((ventasDelMesBrayan * 0.035));
      }
      return comision;
   }

   public long getVentasDelMesBrayan() {
      return ventasDelMesBrayan;
   }

   public void setVentasDelMesBrayan(long ventasDelMesBrayan) {
      this.ventasDelMesBrayan = ventasDelMesBrayan;
   }
}
