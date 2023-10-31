package com.brayanvargas.domainbv;

import java.util.List;

public class Nomina {
   private List<Empleado> empleadosBrayan;

   public Nomina(List<Empleado> empleados) {
      this.empleadosBrayan = empleados;
   }

   public void calcularNominaVargas(){
      listarDirectosVargas();
      listarFreelanceVargas();
      listarPromotoresVargas();
   }

   public void listarDirectosVargas(){
      for (Empleado empleado : empleadosBrayan){
         if (empleado instanceof Directo){
            System.out.println(empleado.getEmpleadoBrayan() + " " + empleado.calcularSalarioVargas() + " Empleado directo");
         }
      }
   }

   public void listarFreelanceVargas(){
      for (Empleado empleado : empleadosBrayan){
         if (empleado instanceof Freelance){
            System.out.println(empleado.getEmpleadoBrayan() + " " + empleado.calcularSalarioVargas() + " Empleado freelance");
         }
      }
   }

   public void listarPromotoresVargas(){
      for (Empleado empleado : empleadosBrayan){
         if (empleado instanceof Promotor){
            System.out.println(empleado.getEmpleadoBrayan() + " " + empleado.calcularSalarioVargas() + " Empleado promotor");
         }
      }
   }

   public List<Empleado> getEmpleadosBrayan() {
      return empleadosBrayan;
   }

   public void setEmpleadosBrayan(List<Empleado> empleadosBrayan) {
      this.empleadosBrayan = empleadosBrayan;
   }
}
