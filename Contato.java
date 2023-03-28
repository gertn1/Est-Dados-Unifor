class Contato {
    private String nome;
    private String telefone;
    private String nascimento;
    private String email;
    private String celular;

    public Contato(String nome, String telefone, String nascimento, String email, String celular) {
        this.nome = nome;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.email = email;
        this.celular = celular;
    }
    public String getTelefone() {
        return telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Nascimento: " + nascimento + ", Email: " + email + ", Celular: " + celular;
    }
}
 