import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TelaAluno extends JFrame {

    private JTextField txtNome;
    private JTextField txtDataNascimento;
    private JComboBox<String> cbSexo;
    private JTextField txtMatricula;
    private JTextField txtCurso;
    private JTextField txtCpf;
    private JTextField txtRua;
    private JTextField txtNumero;
    private JTextField txtBairro;
    private JTextField txtCidade;
    private JTextField txtCep;
    private JComboBox<String> cbEstado;
    private JTextField txtTelefone;

    private JTable tabela;
    private DefaultTableModel modelo;

    private ArrayList<Aluno> alunos;

    public TelaAluno() {

        alunos = AlunoDAO.carregar();

        setTitle("Sistema de Cadastro de Alunos");
        setSize(1200, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        criarTela();
        atualizarTabela();
    }

    private void criarTela() {

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        );

        // TÍTULO

        JLabel titulo = new JLabel("CADASTRO DE ALUNOS");

        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        painelPrincipal.add(titulo, BorderLayout.NORTH);

        // FORMULÁRIO

        JPanel painelFormulario = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // CAMPOS

        txtNome = new JTextField(25);
        txtDataNascimento = new JTextField(10);
        cbSexo = new JComboBox<>(
                new String[]{"Masculino", "Feminino", "Outro"}
        );

        txtMatricula = new JTextField(12);
        txtCurso = new JTextField(20);
        txtCpf = new JTextField(14);

        txtRua = new JTextField(30);
        txtNumero = new JTextField(8);
        txtBairro = new JTextField(20);
        txtCidade = new JTextField(20);
        txtCep = new JTextField(10);

        cbEstado = new JComboBox<>(
                new String[]{
                    "AC", "AL", "AP", "AM", "BA", "CE",
                    "DF", "ES", "GO", "MA", "MT", "MS",
                    "MG", "PA", "PB", "PR", "PE", "PI",
                    "RJ", "RN", "RS", "RO", "RR", "SC",
                    "SP", "SE", "TO"
                }
        );

        txtTelefone = new JTextField(15);

        // ==============================
        // DADOS PESSOAIS
        // ==============================

        JLabel dadosPessoais = new JLabel("DADOS PESSOAIS");

        dadosPessoais.setFont(
                new Font("Arial", Font.BOLD, 15)
        );

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;

        painelFormulario.add(dadosPessoais, gbc);

        // Nome

        adicionarLabel(
                painelFormulario,
                gbc,
                "Nome completo:",
                0,
                1
        );

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.weightx = 1;

        painelFormulario.add(txtNome, gbc);

        gbc.weightx = 0;

        // Sexo

        adicionarLabel(
                painelFormulario,
                gbc,
                "Sexo:",
                4,
                1
        );

        gbc.gridx = 5;
        gbc.gridy = 1;
        gbc.gridwidth = 1;

        painelFormulario.add(cbSexo, gbc);

        // Nascimento

        adicionarLabel(
                painelFormulario,
                gbc,
                "Nascimento:",
                0,
                2
        );

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;

        painelFormulario.add(txtDataNascimento, gbc);

        // Matrícula

        adicionarLabel(
                painelFormulario,
                gbc,
                "Matrícula:",
                2,
                2
        );

        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;

        painelFormulario.add(txtMatricula, gbc);

        // Curso

        adicionarLabel(
                painelFormulario,
                gbc,
                "Curso:",
                4,
                2
        );

        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.gridwidth = 1;

        painelFormulario.add(txtCurso, gbc);

        // CPF

        adicionarLabel(
                painelFormulario,
                gbc,
                "CPF:",
                0,
                3
        );

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;

        painelFormulario.add(txtCpf, gbc);

        // ==============================
        // ENDEREÇO
        // ==============================

        JLabel endereco = new JLabel("ENDEREÇO");

        endereco.setFont(
                new Font("Arial", Font.BOLD, 15)
        );

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 6;

        painelFormulario.add(endereco, gbc);

        // Rua

        adicionarLabel(
                painelFormulario,
                gbc,
                "Rua:",
                0,
                5
        );

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.weightx = 1;

        painelFormulario.add(txtRua, gbc);

        gbc.weightx = 0;

        // Número

        adicionarLabel(
                painelFormulario,
                gbc,
                "Número:",
                4,
                5
        );

        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 1;

        painelFormulario.add(txtNumero, gbc);

        // Bairro

        adicionarLabel(
                painelFormulario,
                gbc,
                "Bairro:",
                0,
                6
        );

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.weightx = 1;

        painelFormulario.add(txtBairro, gbc);

        gbc.weightx = 0;

        // Cidade

        adicionarLabel(
                painelFormulario,
                gbc,
                "Cidade:",
                3,
                6
        );

        gbc.gridx = 4;
        gbc.gridy = 6;
        gbc.gridwidth = 2;

        painelFormulario.add(txtCidade, gbc);

        // CEP

        adicionarLabel(
                painelFormulario,
                gbc,
                "CEP:",
                0,
                7
        );

        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 1;

        painelFormulario.add(txtCep, gbc);

        // Estado

        adicionarLabel(
                painelFormulario,
                gbc,
                "Estado:",
                2,
                7
        );

        gbc.gridx = 3;
        gbc.gridy = 7;
        gbc.gridwidth = 1;

        painelFormulario.add(cbEstado, gbc);

        // Telefone

        adicionarLabel(
                painelFormulario,
                gbc,
                "Telefone:",
                4,
                7
        );

        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.gridwidth = 1;

        painelFormulario.add(txtTelefone, gbc);

        // ==============================
        // BOTÕES
        // ==============================

        JButton btnCadastrar = new JButton("Cadastrar");
        JButton btnEditar = new JButton("Editar");
        JButton btnExcluir = new JButton("Excluir");
        JButton btnLimpar = new JButton("Limpar");

        btnCadastrar.setFont(
                new Font("Arial", Font.BOLD, 13)
        );

        btnEditar.setFont(
                new Font("Arial", Font.BOLD, 13)
        );

        btnExcluir.setFont(
                new Font("Arial", Font.BOLD, 13)
        );

        btnLimpar.setFont(
                new Font("Arial", Font.BOLD, 13)
        );

        JPanel painelBotoes = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER,
                        15,
                        5
                )
        );

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnEditar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnLimpar);

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 6;

        painelFormulario.add(painelBotoes, gbc);

        painelPrincipal.add(
                painelFormulario,
                BorderLayout.CENTER
        );

        // ==============================
        // TABELA
        // ==============================

        modelo = new DefaultTableModel();

        modelo.addColumn("Nome");
        modelo.addColumn("Nascimento");
        modelo.addColumn("Sexo");
        modelo.addColumn("Matrícula");
        modelo.addColumn("Curso");
        modelo.addColumn("CPF");
        modelo.addColumn("Rua");
        modelo.addColumn("Número");
        modelo.addColumn("Bairro");
        modelo.addColumn("Cidade");
        modelo.addColumn("CEP");
        modelo.addColumn("Estado");
        modelo.addColumn("Telefone");

        tabela = new JTable(modelo);

        tabela.setAutoResizeMode(
                JTable.AUTO_RESIZE_OFF
        );

        tabela.setRowHeight(25);

        JScrollPane scrollTabela = new JScrollPane(tabela);

        scrollTabela.setPreferredSize(
                new Dimension(1100, 220)
        );

        painelPrincipal.add(
                scrollTabela,
                BorderLayout.SOUTH
        );

        // ==============================
        // EVENTOS
        // ==============================

        btnCadastrar.addActionListener(
                e -> cadastrar()
        );

        btnEditar.addActionListener(
                e -> editar()
        );

        btnExcluir.addActionListener(
                e -> excluir()
        );

        btnLimpar.addActionListener(
                e -> limparCampos()
        );

        tabela.getSelectionModel()
                .addListSelectionListener(e -> {

            int linha = tabela.getSelectedRow();

            if (linha >= 0) {

                txtNome.setText(
                        tabela.getValueAt(linha, 0).toString()
                );

                txtDataNascimento.setText(
                        tabela.getValueAt(linha, 1).toString()
                );

                cbSexo.setSelectedItem(
                        tabela.getValueAt(linha, 2).toString()
                );

                txtMatricula.setText(
                        tabela.getValueAt(linha, 3).toString()
                );

                txtCurso.setText(
                        tabela.getValueAt(linha, 4).toString()
                );

                txtCpf.setText(
                        tabela.getValueAt(linha, 5).toString()
                );

                txtRua.setText(
                        tabela.getValueAt(linha, 6).toString()
                );

                txtNumero.setText(
                        tabela.getValueAt(linha, 7).toString()
                );

                txtBairro.setText(
                        tabela.getValueAt(linha, 8).toString()
                );

                txtCidade.setText(
                        tabela.getValueAt(linha, 9).toString()
                );

                txtCep.setText(
                        tabela.getValueAt(linha, 10).toString()
                );

                cbEstado.setSelectedItem(
                        tabela.getValueAt(linha, 11).toString()
                );

                txtTelefone.setText(
                        tabela.getValueAt(linha, 12).toString()
                );
            }
        });

        add(painelPrincipal);
    }

    // ==============================
    // ADICIONAR LABEL
    // ==============================

    private void adicionarLabel(
            JPanel painel,
            GridBagConstraints gbc,
            String texto,
            int x,
            int y) {

        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = 1;
        gbc.weightx = 0;

        painel.add(
                new JLabel(texto),
                gbc
        );
    }

    // ==============================
    // CADASTRAR
    // ==============================

    private void cadastrar() {

        if (txtNome.getText().isEmpty()
                || txtMatricula.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Preencha pelo menos o nome e a matrícula."
            );

            return;
        }

        for (Aluno aluno : alunos) {

            if (aluno.getMatricula()
                    .equals(txtMatricula.getText())) {

                JOptionPane.showMessageDialog(
                        this,
                        "Essa matrícula já está cadastrada."
                );

                return;
            }
        }

        Aluno aluno = criarAluno();

        alunos.add(aluno);

        AlunoDAO.salvar(alunos);

        atualizarTabela();

        limparCampos();

        JOptionPane.showMessageDialog(
                this,
                "Aluno cadastrado com sucesso!"
        );
    }

    // ==============================
    // EDITAR
    // ==============================

    private void editar() {

        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Selecione um aluno na tabela."
            );

            return;
        }

        Aluno aluno = alunos.get(linha);

        aluno.setNome(txtNome.getText());
        aluno.setDataNascimento(txtDataNascimento.getText());
        aluno.setSexo(
                cbSexo.getSelectedItem().toString()
        );
        aluno.setMatricula(txtMatricula.getText());
        aluno.setCurso(txtCurso.getText());
        aluno.setCpf(txtCpf.getText());
        aluno.setRua(txtRua.getText());
        aluno.setNumero(txtNumero.getText());
        aluno.setBairro(txtBairro.getText());
        aluno.setCidade(txtCidade.getText());
        aluno.setCep(txtCep.getText());
        aluno.setEstado(
                cbEstado.getSelectedItem().toString()
        );
        aluno.setTelefone(txtTelefone.getText());

        AlunoDAO.salvar(alunos);

        atualizarTabela();

        limparCampos();

        JOptionPane.showMessageDialog(
                this,
                "Aluno editado com sucesso!"
        );
    }

    // ==============================
    // EXCLUIR
    // ==============================

    private void excluir() {

        int linha = tabela.getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(
                    this,
                    "Selecione um aluno na tabela."
            );

            return;
        }

        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente excluir este aluno?",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION
        );

        if (resposta == JOptionPane.YES_OPTION) {

            alunos.remove(linha);

            AlunoDAO.salvar(alunos);

            atualizarTabela();

            limparCampos();

            JOptionPane.showMessageDialog(
                    this,
                    "Aluno excluído com sucesso!"
            );
        }
    }

    // ==============================
    // CRIAR ALUNO
    // ==============================

    private Aluno criarAluno() {

        return new Aluno(
                txtNome.getText(),
                txtDataNascimento.getText(),
                cbSexo.getSelectedItem().toString(),
                txtMatricula.getText(),
                txtCurso.getText(),
                txtCpf.getText(),
                txtRua.getText(),
                txtNumero.getText(),
                txtBairro.getText(),
                txtCidade.getText(),
                txtCep.getText(),
                cbEstado.getSelectedItem().toString(),
                txtTelefone.getText()
        );
    }

    // ==============================
    // ATUALIZAR TABELA
    // ==============================

    private void atualizarTabela() {

        modelo.setRowCount(0);

        for (Aluno aluno : alunos) {

            modelo.addRow(new Object[]{
                aluno.getNome(),
                aluno.getDataNascimento(),
                aluno.getSexo(),
                aluno.getMatricula(),
                aluno.getCurso(),
                aluno.getCpf(),
                aluno.getRua(),
                aluno.getNumero(),
                aluno.getBairro(),
                aluno.getCidade(),
                aluno.getCep(),
                aluno.getEstado(),
                aluno.getTelefone()
            });
        }
    }

    // ==============================
    // LIMPAR CAMPOS
    // ==============================

    private void limparCampos() {

        txtNome.setText("");
        txtDataNascimento.setText("");
        cbSexo.setSelectedIndex(0);
        txtMatricula.setText("");
        txtCurso.setText("");
        txtCpf.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        cbEstado.setSelectedIndex(0);
        txtTelefone.setText("");

        tabela.clearSelection();
    }

    // ==============================
    // MAIN
    // ==============================

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            TelaAluno tela = new TelaAluno();

            tela.setVisible(true);
        });
    }
}