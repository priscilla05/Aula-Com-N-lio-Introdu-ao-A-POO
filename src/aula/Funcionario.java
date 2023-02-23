package aula;
//classe: é o tipo. especifica a  estrutura
//objeto: instancias, conforme a estrutura

public class Funcionario {
//Atributos (Dados)
public String nome; // public pode ser acessado por outras classes
public double valorPorHora;
public int horas;

//Metodos (Funcoes dentro da class(comportamentos)

  public double total(){
     return valorPorHora * horas;
  }


}
