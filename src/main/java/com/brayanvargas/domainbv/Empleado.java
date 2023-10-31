package com.brayanvargas.domainbv;

public abstract class Empleado {
   private String empleadoBrayan;

   public Empleado(String empleadoBrayan) {
      this.empleadoBrayan = empleadoBrayan;
   }

   public abstract Long calcularSalarioVargas();

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
