package cadastroalunos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CadastroAlunos extends JFrame {

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
    private JTextArea txtArea;

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public CadastroAlunos() {

        setTitle("Cadastro de Alunos");
        setSize(700, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel(new GridLayout(0, 2, 5, 5));

        painel.add(new JLabel("Nome completo:"));
        txtNome = new JTextField();
        painel.add(txtNome);

        painel.add(new JLabel("Data de nascimento:"));
        txtDataNascimento = new JTextField();
        painel.add(txtDataNascimento);

        painel.add(new JLabel("Sexo:"));
        cbSexo = new JComboBox<>(new String[]{
            "Masculino",
            "Feminino",
            "Outro"
        });
        painel.add(cbSexo);

        painel.add(new JLabel("Matrícula:"));
        txtMatricula = new JTextField();
        painel.add(txtMatricula);

        painel.add(new JLabel("Curso:"));
        txtCurso = new JTextField();
        painel.add(txtCurso);

        painel.add(new JLabel("CPF:"));
        txtCpf = new JTextField();
        painel.add(txtCpf);

        painel.add(new JLabel("Rua:"));
        txtRua = new JTextField();
        painel.add(txtRua);

        painel.add(new JLabel("Número:"));
        txtNumero = new JTextField();
        painel.add(txtNumero);

        painel.add(new JLabel("Bairro:"));
        txtBairro = new JTextField();
        painel.add(txtBairro);

        painel.add(new JLabel("Cidade:"));
        txtCidade = new JTextField();
        painel.add(txtCidade);

        painel.add(new JLabel("CEP:"));
        txtCep = new JTextField();
        painel.add(txtCep);

        painel.add(new JLabel("Estado:"));
        cbEstado = new JComboBox<>(new String[]{
            "AC", "AL", "AP", "AM", "BA", "CE", "DF",
            "ES", "GO", "MA", "MT", "MS", "MG", "PA",
            "PB", "PR", "PE", "PI", "RJ", "RN", "RS",
            "RO", "RR", "SC", "SP", "SE", "TO"
        });
        painel.add(cbEstado);

        painel.add(new JLabel("Telefone:"));
        txtTelefone = new JTextField();
        painel.add(txtTelefone);

        JButton btnCadastrar = new JButton("Cadastrar");
        painel.add(btnCadastrar);

        JButton btnLimpar = new JButton("Limpar");
        painel.add(btnLimpar);

        txtArea = new JTextArea();
        txtArea.setEditable(false);

        JScrollPane scroll = new JScrollPane(txtArea);

        JPanel principal = new JPanel(new BorderLayout(10, 10));
        principal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        principal.add(painel, BorderLayout.NORTH);
        principal.add(scroll, BorderLayout.CENTER);

        add(principal);

        btnCadastrar.addActionListener(e -> cadastrarAluno());

        btnLimpar.addActionListener(e -> limparCampos());
    }

    private void cadastrarAluno() {

        try {

            String nome = txtNome.getText();
            String dataNascimento = txtDataNascimento.getText();
            String sexo = cbSexo.getSelectedItem().toString();

            int matricula = Integer.parseInt(txtMatricula.getText());

            String curso = txtCurso.getText();
            String cpf = txtCpf.getText();

            String rua = txtRua.getText();
            String numero = txtNumero.getText();
            String bairro = txtBairro.getText();
            String cidade = txtCidade.getText();
            String cep = txtCep.getText();

            String endereco = rua + ", " +
                              numero + ", " +
                              bairro + ", " +
                              cidade + ", " +
                              cep;

            String estado = cbEstado.getSelectedItem().toString();
            String telefone = txtTelefone.getText();

            if (nome.isEmpty() ||
                dataNascimento.isEmpty() ||
                txtMatricula.getText().isEmpty() ||
                curso.isEmpty() ||
                cpf.isEmpty() ||
                rua.isEmpty() ||
                numero.isEmpty() ||
                bairro.isEmpty() ||
                cidade.isEmpty() ||
                cep.isEmpty() ||
                telefone.isEmpty()) {

                JOptionPane.showMessageDialog(
                    this,
                    "Preencha todos os campos!"
                );

                return;
            }

            // Verifica se a matrícula já existe
            for (Aluno aluno : alunos) {

                if (aluno.getMatricula() == matricula) {

                    JOptionPane.showMessageDialog(
                        this,
                        "A matrícula " + matricula +
                        " já está cadastrada!"
                    );

                    return;
                }
            }

            Aluno aluno = new Aluno(
                nome,
                dataNascimento,
                sexo,
                matricula,
                curso,
                cpf,
                endereco,
                estado,
                telefone
            );

            alunos.add(aluno);

            txtArea.append(aluno.toString() + "\n");

            JOptionPane.showMessageDialog(
                this,
                "Aluno cadastrado com sucesso!"
            );

            limparCampos();

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                this,
                "A matrícula deve ser um número!"
            );
        }
    }

    private void limparCampos() {

        txtNome.setText("");
        txtDataNascimento.setText("");
        txtMatricula.setText("");
        txtCurso.setText("");
        txtCpf.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        txtTelefone.setText("");

        cbSexo.setSelectedIndex(0);
        cbEstado.setSelectedIndex(0);

        txtNome.requestFocus();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new CadastroAlunos().setVisible(true);
        });
    }
}