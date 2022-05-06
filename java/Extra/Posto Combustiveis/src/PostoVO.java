import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class PostoVO {

    DecimalFormat df = new DecimalFormat("0.000"); // Preços
    DecimalFormat rs = new DecimalFormat("0.00");  // Litros

    public float[] tanques = new float[4];
    public int[] servicos = new int[5]; 
    public float[] litrosVendidos = new float[5]; 
    public float[] litrosComprados = new float[5]; 
    public float despesaCombustiveis;
    public float lucroCombustiveis;
    public float lucroServicos;

    public PostoVO() { 
        for (int i = 0; i < 4; i++) {
            this.tanques[i] = 0;
        }
    }

    public void abastecerTanque(int tanque, int valor) { 
        if (tanque == 1) { //TANQUE ETANOL

            if ((this.tanques[0] + valor) <= 20000 && (valor > 0)) {
                this.tanques[0] += valor;
                this.litrosComprados[0] += valor;
                this.litrosComprados[4] += valor;
                this.despesaCombustiveis += (valor * 1.19);
                JOptionPane.showMessageDialog(null, "Tanque abastecido com sucesso !!!", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            } else if (this.tanques[0] == 20000 && (valor > 0)) {
                JOptionPane.showMessageDialog(null, "O tanque está cheio!!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Erro, valor negativo !!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if ((this.tanques[0] + valor) > 2000) {
                JOptionPane.showMessageDialog(null, "O valor excede a capacidade do tanque!", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        } else if (tanque == 2) {//TANQUE GAS COMUM

            if ((this.tanques[1] + valor) <= 20000 && (valor > 0)) {
                this.tanques[1] += valor;
                this.litrosComprados[1] += valor;
                this.litrosComprados[4] += valor;
                this.despesaCombustiveis += (valor * 2.19);
                JOptionPane.showMessageDialog(null, "Tanque abastecido com sucesso !!!", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            } else if (this.tanques[1] == 20000 && (valor > 0)) {
                JOptionPane.showMessageDialog(null, "O tanque está cheio!!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Erro, valor negativo !!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if ((this.tanques[1] + valor) > 2000) {
                JOptionPane.showMessageDialog(null, "O valor excede a capacidade do tanque!", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        } else if (tanque == 3) {//TANQUE GAS ADV

            if ((this.tanques[2] + valor) <= 20000 && (valor > 0)) {
                this.tanques[2] += valor;
                this.litrosComprados[2] += valor;
                this.litrosComprados[4] += valor;
                this.despesaCombustiveis += (valor * 2.29);
                JOptionPane.showMessageDialog(null, "Tanque abastecido com sucesso !!!", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            } else if (this.tanques[2] == 20000 && (valor > 0)) {
                JOptionPane.showMessageDialog(null, "O tanque está cheio!!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Erro, valor negativo !!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if ((this.tanques[2] + valor) > 2000) {
                JOptionPane.showMessageDialog(null, "O valor excede a capacidade do tanque!", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        } else if (tanque == 4) {//TANQUE DIESEL

            if ((this.tanques[3] + valor) <= 20000 && (valor > 0)) {
                this.tanques[3] += valor;
                this.litrosComprados[3] += valor;
                this.litrosComprados[4] += valor;
                this.despesaCombustiveis += (valor * 1.39);
                JOptionPane.showMessageDialog(null, "Tanque abastecido com sucesso !!!", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            } else if (this.tanques[3] == 20000 && (valor > 0)) {
                JOptionPane.showMessageDialog(null, "O tanque está cheio!!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Erro, valor negativo !!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if ((this.tanques[3] + valor) > 2000) {
                JOptionPane.showMessageDialog(null, "O valor excede a capacidade do tanque!", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    public void abastecerCarro(int tmpCombustivel, float valor) {
        float tmpLitros;

        if (tmpCombustivel == 1) {

            tmpLitros = (float) (valor / 2.39);

            if ((this.tanques[0] - tmpLitros) >= 0 && (valor > 0)) {
                this.tanques[0] -= tmpLitros;
                this.litrosVendidos[0] += tmpLitros;
                this.litrosVendidos[4] += tmpLitros;
                this.lucroCombustiveis += valor;
                JOptionPane.showMessageDialog(null, "Abastecimento efetuado !!!\n" + df.format(tmpLitros) + " Litros", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            } else if (this.tanques[0] == 0 && (valor > 0)) {
                JOptionPane.showMessageDialog(null, "A bomba de Etanol está vazia !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Erro, valor negativo !!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if (tmpLitros > this.tanques[0]) {
                JOptionPane.showMessageDialog(null, "Não temos combustível suficiente !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        } else if (tmpCombustivel == 2) {

            tmpLitros = (float) (valor / 3.49);

            if ((this.tanques[1] - tmpLitros) >= 0 && (valor > 0)) {
                this.tanques[1] -= tmpLitros;
                this.litrosVendidos[1] += tmpLitros;
                this.litrosVendidos[4] += tmpLitros;
                this.lucroCombustiveis += valor;
                JOptionPane.showMessageDialog(null, "Abastecimento efetuado !!!\n" + df.format(tmpLitros) + " Litros", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            } else if (this.tanques[1] == 0 && (valor > 0)) {
                JOptionPane.showMessageDialog(null, "A bomba de Gasolina Comum está vazia !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Erro, valor negativo !!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if (tmpLitros > this.tanques[1]) {
                JOptionPane.showMessageDialog(null, "Não temos combustível suficiente !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        } else if (tmpCombustivel == 3) {

            tmpLitros = (float) (valor / 3.69);

            if ((this.tanques[2] - tmpLitros) >= 0 && (valor > 0)) {
                this.tanques[2] -= tmpLitros;
                this.litrosVendidos[2] += tmpLitros;
                this.litrosVendidos[4] += tmpLitros;
                this.lucroCombustiveis += valor;
                JOptionPane.showMessageDialog(null, "Abastecimento efetuado !!!\n" + df.format(tmpLitros) + " Litros", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            } else if (this.tanques[2] == 0 && (valor > 0)) {
                JOptionPane.showMessageDialog(null, "A bomba de Gasolina Aditivada está vazia !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Erro, valor negativo !!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if (tmpLitros > this.tanques[2]) {
                JOptionPane.showMessageDialog(null, "Não temos combustível suficiente !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        } else if (tmpCombustivel == 4) {

            tmpLitros = (float) (valor / 2.89);

            if ((this.tanques[3] - tmpLitros) >= 0 && (valor > 0)) {
                this.tanques[3] -= tmpLitros;
                this.litrosVendidos[3] += tmpLitros;
                this.litrosVendidos[4] += tmpLitros;
                this.lucroCombustiveis += valor;
                JOptionPane.showMessageDialog(null, "Abastecimento efetuado !!!\n" + df.format(tmpLitros) + " Litros", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
            } else if (this.tanques[3] == 0 && (valor > 0)) {
                JOptionPane.showMessageDialog(null, "A bomba de Diesel está vazia !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            } else if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "Erro, valor negativo !!!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else if (tmpLitros > this.tanques[3]) {
                JOptionPane.showMessageDialog(null, "Não temos combustível suficiente !!!", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        }
    }

    public String relatorioTanques() {
        String tmpRelatorioTanques = "";

        tmpRelatorioTanques += "Situação atual dos tanques:\n";
        tmpRelatorioTanques += "1 - Etanol: " + df.format(this.tanques[0]) + " litros\n";
        tmpRelatorioTanques += "2 - Gasolina Comum: " + df.format(this.tanques[1]) + " litros\n";
        tmpRelatorioTanques += "3 - Gasolina Aditivada: " + df.format(this.tanques[2]) + " litros\n";
        tmpRelatorioTanques += "4 - Diesel: " + df.format(this.tanques[3]) + " litros\n";

        return tmpRelatorioTanques;
    }

    public void venderServico(int servico) {
        if (servico == 1) {
            this.servicos[0]++;
            this.servicos[4]++;
            this.lucroServicos += 8.00;
            JOptionPane.showMessageDialog(null, "Ducha Concluída !!!\nValor: RS 8,00", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
        } else if (servico == 2) {
            this.servicos[1]++;
            this.servicos[4]++;
            this.lucroServicos += 50.00;
            JOptionPane.showMessageDialog(null, "Troca de óleo efetuada !!!\nValor: R$ 50,00", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
        } else if (servico == 3) {
            this.servicos[2]++;
            this.servicos[4]++;
            this.lucroServicos += 35.00;
            JOptionPane.showMessageDialog(null, "Balanceamento Concluído !!!\nValor: RS 35,00", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
        } else if (servico == 4) {
            this.servicos[3]++;
            this.servicos[4]++;
            this.lucroServicos += 2.00;
            JOptionPane.showMessageDialog(null, "Café comprado !!!\nValor: RS 2,00", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public String relatorioVendas() {
        String tmpRelatorioVendas = "";

        tmpRelatorioVendas += "Combustíveis vendidos:\n";
        tmpRelatorioVendas += "Etanol = " + df.format(this.litrosVendidos[0]) + " litros | R$ " + rs.format(this.litrosVendidos[0] * 2.39) + "\n";
        tmpRelatorioVendas += "Gasolina Comum = " + df.format(this.litrosVendidos[1]) + " litros | R$ " + rs.format(this.litrosVendidos[1] * 3.49) + "\n";
        tmpRelatorioVendas += "Gasolina Aditivada = " + df.format(this.litrosVendidos[2]) + " litros | R$ " + rs.format(this.litrosVendidos[2] * 3.69) + "\n";
        tmpRelatorioVendas += "Diesel = " + df.format(this.litrosVendidos[3]) + " litros | R$ " + rs.format(this.litrosVendidos[3] * 2.89) + "\n";
        tmpRelatorioVendas += "Total: " + df.format(this.litrosVendidos[4]) + " | R$ " + rs.format(this.lucroCombustiveis) + "\n";
        tmpRelatorioVendas += "----------------------------------------------------\n";
        tmpRelatorioVendas += "Serviços vendidos:\n";
        tmpRelatorioVendas += "Ducha Ecológica = " + this.servicos[0] + " | R$" + rs.format(this.servicos[0] * 8.00) + "\n";
        tmpRelatorioVendas += "Troca de Óleo = " + this.servicos[1] + " | R$" + rs.format(this.servicos[1] * 50.00) + "\n";
        tmpRelatorioVendas += "Balanceamento = " + this.servicos[2] + " | R$" + rs.format(this.servicos[2] * 35.00) + "\n";
        tmpRelatorioVendas += "Café = " + this.servicos[3] + " | R$" + rs.format(this.servicos[3] * 2.00) + "\n";
        tmpRelatorioVendas += "Total: " + this.servicos[4] + " serviços | R$ " + rs.format(this.lucroServicos) + "\n";

        return tmpRelatorioVendas;
    }

    public String relatorioDespesas() {
        String tmpRelatorioDespesas = "";

        tmpRelatorioDespesas += "Despesas:\n";
        tmpRelatorioDespesas += "Etanol = " + df.format(this.litrosComprados[0]) + " litros | R$ " + rs.format(this.litrosComprados[0] * 1.19) + "\n";
        tmpRelatorioDespesas += "Gasolina Comum = " + df.format(this.litrosComprados[1]) + " litros | R$" + rs.format(this.litrosComprados[1] * 2.19) + "\n";
        tmpRelatorioDespesas += "Gasolina Aditivada = " + df.format(this.litrosComprados[2]) + " litros | R$" + rs.format(this.litrosComprados[2] * 2.29) + "\n";
        tmpRelatorioDespesas += "Diesel = " + df.format(this.litrosComprados[3]) + " litros | R$ " + rs.format(this.litrosComprados[3] * 1.39) + "\n";
        tmpRelatorioDespesas += "Total = " + df.format(this.litrosComprados[4]) + " litros | R$ " + rs.format(this.despesaCombustiveis) + "\n";

        return tmpRelatorioDespesas;
    }

    public String relatorioLucros() {
        String tmpRelatorioLucros = "";

        tmpRelatorioLucros += "Combustíveis:\n";
        tmpRelatorioLucros += "Lucro bruto = R$ " + rs.format(this.lucroCombustiveis) + "\n";
        tmpRelatorioLucros += "Lucro liquido = R$ " + rs.format((this.lucroCombustiveis - this.despesaCombustiveis)) + "\n";
        tmpRelatorioLucros += "-------------------------\n";
        tmpRelatorioLucros += "Serviços:\n";
        tmpRelatorioLucros += "Lucro bruto: R$ " + rs.format(this.lucroServicos) + "\n"; //Como não há despesas com serviÃ§os, o lucro Ã© bruto
        tmpRelatorioLucros += "-------------------------\n";
        tmpRelatorioLucros += "Total:\n";
        tmpRelatorioLucros += "Lucros Brutos: R$ " + rs.format((this.lucroCombustiveis + this.lucroServicos)) + "\n";
        tmpRelatorioLucros += "Lucros Líquidos: R$ " + rs.format(((this.lucroCombustiveis - this.despesaCombustiveis) + this.lucroServicos)) + "\n";
        return tmpRelatorioLucros;
    }
}
