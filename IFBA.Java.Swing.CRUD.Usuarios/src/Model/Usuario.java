package Model;

/**
 *
 * @author michel
 */
public class Usuario {
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String CPF;
    private String RG;
    private Contato contato;
    private Endereco endereco;

    public Usuario() {
        contato = new Contato();
        endereco = new Endereco();
    }

    public Usuario(String nome, String dataNascimento, String sexo, String CPF, String RG, Contato contato, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.CPF = CPF;
        this.RG = RG;
        this.contato = contato;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    public void setContato(String telefone) {
        this.contato.setTelefone(telefone);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
      public void setEndereco(String cidade) {
        this.endereco.setCidade(cidade);
    }
    
    
    
    
}
