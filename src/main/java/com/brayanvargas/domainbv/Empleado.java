package com.brayanvargas.domainbv;

public class Empleado {
   private String empleadoBrayan;

   public Empleado(String empleadoBrayan) {
      this.empleadoBrayan = empleadoBrayan;
   }

   public long calcularSalarioVargas(){
      return 2;
   }

   @Override
   public String toString() {
      return "Empleado{" +
            "empleadoBrayan='" + empleadoBrayan + '\'' +
            '}';
   }

   public String getEmpleadoBrayan() {
      return empleadoBrayan;
   }

   public void setEmpleadoBrayan(String empleadoBrayan) {
      this.empleadoBrayan = empleadoBrayan;
   }
}
