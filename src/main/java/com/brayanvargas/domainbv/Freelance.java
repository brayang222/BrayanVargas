package com.brayanvargas.domainbv;

public class Freelance extends Empleado{
   private long valorHoraBrayan;
   private int horasTrabajadasBrayan;

   public Freelance(String nombreBrayan, long valorHoraBrayan, int horasTrabajadasBrayan) {
      super(nombreBrayan);
      this.valorHoraBrayan = valorHoraBrayan;
      this.horasTrabajadasBrayan = horasTrabajadasBrayan;
   }

   @Override
   public Long calcularSalarioVargas() {
      return valorHoraBrayan * horasTrabajadasBrayan;
   }

   public long getValorHoraBrayan() {
      return valorHoraBrayan;
   }

   public int getHorasTrabajadasBrayan() {
      return horasTrabajadasBrayan;
   }

   public void setHorasTrabajadasBrayan(int horasTrabajadasBrayan) {
      this.horasTrabajadasBrayan = horasTrabajadasBrayan;
   }

   public void setValorHoraBrayan(long valorHoraBrayan) {
      this.valorHoraBrayan = valorHoraBrayan;
   }
}
