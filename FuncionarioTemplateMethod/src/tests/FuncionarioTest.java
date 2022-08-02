package tests;

import entities.Contratado;
import entities.Efetivo;
import entities.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FuncionarioTest {

    Funcionario funcionario1, funcionario2;

    @BeforeEach
    void doBefore(){
       funcionario1 = new Efetivo("José", "Antunes", "312132", 3000.0, 500, 100);
       funcionario2 = new Contratado("Aila","Torres", "132123123", 30.0, 48);

    }
       @Test

        void tests(){
           funcionario1.pagamentoSalario();
           funcionario2.pagamentoSalario();
        }


}
