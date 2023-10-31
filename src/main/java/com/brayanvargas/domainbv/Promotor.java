package com.brayanvargas.domainbv;

public class Promotor extends Empleado{
   private int volantesRepartidosBrayan;
   private long valorVolanteBrayan;
   private int comprasVolanteBrayan;

   public Promotor(String nombreBrayan, int volantesRepartidosBrayan, long valorVolanteBrayan, int comprasVolanteBrayan) {
      super(nombreBrayan);
      this.volantesRepartidosBrayan = volantesRepartidosBrayan;
      this.valorVolanteBrayan = valorVolanteBrayan;
      this.comprasVolanteBrayan = comprasVolanteBrayan;
   }

   @Override
   public Long calcularSalarioVargas() {
      return (long) ((valorVolanteBrayan * volantesRepartidosBrayan) + (15.000 * comprasVolanteBrayan));
   }

   public int getVolantesRepartidosBrayan() {
      return volantesRepartidosBrayan;
   }

   public long getValorVolanteBrayan() {
      return valorVolanteBrayan;
   }

   public int getComprasVolanteBrayan() {
      return comprasVolanteBrayan;
   }

   public void setVolantesRepartidosBrayan(int volantesRepartidosBrayan) {
      this.volantesRepartidosBrayan = volantesRepartidosBrayan;
   }

   public void setComprasVolanteBrayan(int comprasVolanteBrayan) {
      this.comprasVolanteBrayan = comprasVolanteBrayan;
   }
}
