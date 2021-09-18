/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package policine;

/**
 *
 * @author PC-DIANA
 */
public class Sala {
    
    String tipoSala;
    int numeroTickets;
    double total;
    
    public Sala(String tipoSala, int numeroTickets, double total){
      this.tipoSala = tipoSala;
      this.numeroTickets=numeroTickets;
      this.total = total;
      
    }
}
