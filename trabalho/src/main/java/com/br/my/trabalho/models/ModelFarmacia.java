/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.my.trabalho.models;

import com.br.my.trabalho.entities.Clientes;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/* 
    Aqui é o sistema do código para definirmos as entidades e o modelo 
*/


/* 
    Nossa classe de modelo é chamada AbstractTableModel.
    E para usarmos ela, precisamos usar o conceito de herança, que é estender ela.
*/
public class ModelFarmacia extends AbstractTableModel{ 

    /* 
    Vamos usa-lo para salvar nossos pedidos.
    Criando um ArrayList Estático para que ele sempre mantenha o mesmo Array sem que fique criando outro toda vez que encerramos o programa. 
    Esse estático vai fazer com que o ArrayList se torne meio que o atributo da classe. Que ele nunca vai ser reiniciado!
    */
    // Nosso arraylist será do tipo CLIENTES, nossa entidade.
    static ArrayList<Clientes> farmacia = new ArrayList();
    
    
    // Para definir nossas colunas 
    String[] colunas = {"Nome", "Cpf", "Produto", "Preço"}; 
    
    
    // Método para não retornar nada (void). 
    // Método responsavel por pegar o pedido adicionado e no ArrayList.
    public void cadastrarClientes(Clientes c){
        // Então nós chamamos o ArrayList e adicionamos pedido.
        farmacia.add(c);
        // Comando pra quando a tabela receber um dado novo, ela ser atualizada. Vai aparecer os campos preenchidos.
        this.fireTableDataChanged();
    }
    
    
    // Método para retornar meu pedido na tabela.
    public Clientes returnClientes(int index){
        return farmacia.get(index);
    }
    
    // Método para alterar uma informação da minha tabela.
    public void alterarClientes(int index, Clientes c){
        farmacia.set(index, c);
        this.fireTableDataChanged();
    }
    
    // Método para remover um pedido da minha tabela.
    public void removerClientes(int index){
        farmacia.remove(index);
        this.fireTableDataChanged();
    }
    
    
    
    /*
        Esses são os métodos abstratos da minha classe mãe.
    */
    
    // Pra pegar o número de linhas da tabela.
    @Override
    public int getRowCount() {
        // Aqui é pra nossa linha ser do tamanho do nosso ArrayList.
        return farmacia.size();
    }

    // Pra pegar o número de colunas da tabela.
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    // Pra inserir o nome das colunas conforme cada campo do meu banco de dados.
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    // Aqui é justamente pra inserirmos nossos dados no meu banco de dados.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return farmacia.get(rowIndex).getNome();
        } else if(columnIndex == 1){
            return farmacia.get(rowIndex).getCpf();
        } else if (columnIndex == 2){
            return farmacia.get(rowIndex).getProduto();
        } else {
            return farmacia.get(rowIndex).getPreco();
        }
    }
    
}
