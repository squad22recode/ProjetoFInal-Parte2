import java.util.Date;

public class ClienteModel {
    private String complemento;
    private String nome;
    private Date dataNascimento;
    private int idCliente;
    private String cpf;
    private int id;
    private int idEmpresa;

    public ClienteModel(String complemento, String nome, Date dataNascimento, int idCliente, String cpf, int id, int idEmpresa) {
        this.complemento = complemento;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idCliente = idCliente;
        this.cpf = cpf;
        this.id = id;
        this.idEmpresa = idEmpresa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
