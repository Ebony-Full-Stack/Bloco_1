import javax.swing.*;

public class PostoView {

    public PostoView() {
        PostoVO objVO = new PostoVO(); 

        JOptionPane.showMessageDialog(null, "Bem vindo ao Ebony Posto !!!", "Bem vindo", JOptionPane.INFORMATION_MESSAGE);

        String menu1 = "";
        String menu2 = "";
        String menu3 = "";
        String menu4 = "";
        String menu5 = "";
        String menu6 = "";

        int opcao, opcao2, opcao3, opcao4, opcao5, opcao6;

        menu1 += "Escolha uma opção: \n";
        menu1 += "1 - Gerenciamento do posto;\n";
        menu1 += "2 - Vendas;\n";
        menu1 += "3 - Sair;";

        menu2 += "Escolha uma opção: \n";
        menu2 += "1 - Abastecimento dos tanques;\n";
        menu2 += "2 - Relatório dos tanques;\n";
        menu2 += "3 - Relatório de vendas;\n";
        menu2 += "4 - Relatório de despesas;\n";
        menu2 += "5 - Relatório de lucros;\n";
        menu2 += "6 - Voltar;";

        menu3 += "Escolha o tanque a ser abastecido:\n";
        menu3 += "1 - Etanol;\n";
        menu3 += "2 - Gasolina comum;\n";
        menu3 += "3 - Gasolina Aditivada;\n";
        menu3 += "4 - Diesel;\n";
        menu3 += "5 - Voltar;";

        menu4 += "Escolha uma opção:\n";
        menu4 += "1 - Abastecimento;\n";
        menu4 += "2 - Serviços;\n";
        menu4 += "3 - Voltar;";

        menu5 += "Escolha o combustível que deseja abastecer:\n";
        menu5 += "1 - Etanol (R$ 2,39);\n";
        menu5 += "2 - Gasolina comum (R$ 3,49);\n";
        menu5 += "3 - Gasolina Aditivada (R$ 3,69);\n";
        menu5 += "4 - Diesel (R$ 2,89);\n";
        menu5 += "5 - Voltar;";

        menu6 += "Escolha uma opção:\n";
        menu6 += "1 - Ducha Ecológica (R$ 8,00)\n";
        menu6 += "2 - Troca de Óleo (R$ 50,00)\n";
        menu6 += "3 - Balanceamento (R$ 35,00)\n";
        menu6 += "4 - Café (R$ 2,00)\n";
        menu6 += "5 - Voltar;";

       
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu1, "Ebony Posto", JOptionPane.INFORMATION_MESSAGE));

            if (opcao == 1) { //GERENCIAMENTO DO POSTO

                do {
                    opcao2 = Integer.parseInt(JOptionPane.showInputDialog(null, menu2, "Gerência", JOptionPane.INFORMATION_MESSAGE));
                    if (opcao2 == 1) { //ABASTECIMENTO DOS TANQUES
                        do {
                            opcao3 = Integer.parseInt(JOptionPane.showInputDialog(null, menu3, "Abastecimento - Posto", JOptionPane.INFORMATION_MESSAGE));
                            if (opcao3 == 1) {
                                int tmpEtanol = Integer.parseInt(JOptionPane.showInputDialog(null, "Tanque de Etanol\nDigite o valor a ser abastecido:", "Etanol", JOptionPane.INFORMATION_MESSAGE));
                                objVO.abastecerTanque(opcao3, tmpEtanol);
                            } else if (opcao3 == 2) {
                                int tmpGasComum = Integer.parseInt(JOptionPane.showInputDialog(null, "Tanque de Gasolina Comum\nDigite o valor a ser abastecido:", "Gasolina Comum", JOptionPane.INFORMATION_MESSAGE));
                                objVO.abastecerTanque(opcao3, tmpGasComum);
                            } else if (opcao3 == 3) {
                                int tmpGasAditivada = Integer.parseInt(JOptionPane.showInputDialog(null, "Tanque de Gasolina Aditivada\nDigite o valor a ser abastecido:", "Gasolina Aditivada", JOptionPane.INFORMATION_MESSAGE));
                                objVO.abastecerTanque(opcao3, tmpGasAditivada);
                            } else if (opcao3 == 4) {
                                int tmpDiesel = Integer.parseInt(JOptionPane.showInputDialog(null, "Tanque de Diesel\nDigite o valor a ser abastecido:", "Diesel", JOptionPane.INFORMATION_MESSAGE));
                                objVO.abastecerTanque(opcao3, tmpDiesel);
                            } else if (opcao3 != 5) {
                                JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                            }
                        } while (opcao3 != 5);
                    } else if (opcao2 == 2) { //RELATÓRIO DOS TANQUES
                        JOptionPane.showMessageDialog(null, objVO.relatorioTanques(), "Relatório - Tanques", JOptionPane.INFORMATION_MESSAGE);
                    } else if (opcao2 == 3) { //RELATÓRIO DE VENDAS
                        JOptionPane.showMessageDialog(null, objVO.relatorioVendas(), "Relatório - Vendas", JOptionPane.INFORMATION_MESSAGE);
                    } else if (opcao2 == 4) { //RELATÓRIO DESPESAS
                        JOptionPane.showMessageDialog(null, objVO.relatorioDespesas(), "Relatório - Despesas", JOptionPane.INFORMATION_MESSAGE);
                    } else if (opcao2 == 5) { //RELATÓRIO lUCROS
                        JOptionPane.showMessageDialog(null, objVO.relatorioLucros(), "Relatório - Lucros", JOptionPane.INFORMATION_MESSAGE);
                    } else if (opcao2 != 6) {
                        JOptionPane.showMessageDialog(null, "Opção inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                    }

                } while (opcao2 != 6);

            } else if (opcao == 2) { //GERENCIAMENTO DE VENDAS
                do {
                    opcao4 = Integer.parseInt(JOptionPane.showInputDialog(null, menu4, "Posto Shell", JOptionPane.INFORMATION_MESSAGE));
                    if (opcao4 == 1) {//Abastecimento
                        do {
                            opcao5 = Integer.parseInt(JOptionPane.showInputDialog(null, menu5, "Bombas de combustÃ­vel", JOptionPane.INFORMATION_MESSAGE));
                            if (opcao5 == 1) {//Abastecer etanol
                                float tmpEtanol2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Bomba de Etanol\nDigite o valor em R$ a ser abastecido:", "Etanol", JOptionPane.INFORMATION_MESSAGE));
                                objVO.abastecerCarro(opcao5, tmpEtanol2);
                            } else if (opcao5 == 2) {//Abastecer Gasolina Comum
                                float tmpGasComum2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Bomba de Gasolina Comum\nDigite o valor em R$ a ser abastecido:", "Gasolina Comum", JOptionPane.INFORMATION_MESSAGE));
                                objVO.abastecerCarro(opcao5, tmpGasComum2);
                            } else if (opcao5 == 3) {//Abastecer Gasolina aditivada
                                float tmpGasAditivada2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Bomba de Gasolina Aditivada\nDigite o valor em R$ a ser abastecido:", "Gasolina Aditivada", JOptionPane.INFORMATION_MESSAGE));
                                objVO.abastecerCarro(opcao5, tmpGasAditivada2);
                            } else if (opcao5 == 4) {//Abastecer Diesel
                                float tmpDiesel2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Bomba de Diesel\nDigite o valor em R$ a ser abastecido:", "Diesel", JOptionPane.INFORMATION_MESSAGE));
                                objVO.abastecerCarro(opcao5, tmpDiesel2);
                            } else if (opcao5 != 5) {
                                JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                            }
                        } while (opcao5 != 5);
                        
                    } else if (opcao4 == 2) { //SERVIÇOS
                        do {
                            opcao6 = Integer.parseInt(JOptionPane.showInputDialog(null, menu6, "Serviços", JOptionPane.INFORMATION_MESSAGE));
                            if (opcao6 == 1) {
                                objVO.venderServico(opcao6);
                            } else if (opcao6 == 2) {
                                objVO.venderServico(opcao6);
                            } else if (opcao6 == 3) {
                                objVO.venderServico(opcao6);
                            } else if (opcao6 == 4) {
                                objVO.venderServico(opcao6);
                            } else if (opcao6 != 5) {
                                JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                            }
                        } while (opcao6 != 5);
                    } else if (opcao4 != 3) {
                        JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } while (opcao4 != 3);
                
            } else if (opcao != 3) {
                JOptionPane.showMessageDialog(null, "Opção Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } while (opcao != 3);

    }
}
