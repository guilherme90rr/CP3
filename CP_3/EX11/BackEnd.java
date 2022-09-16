package EX11;

public class BackEnd extends TecnologiasDesenvolvimento implements Tecnologia {

    private boolean conteinerizacao;

    public boolean isConteinerizacao() {
        return this.conteinerizacao;
    }

    public boolean getConteinerizacao() {
        return this.conteinerizacao;
    }

    public void setConteinerizacao(boolean conteinerizacao) {
        this.conteinerizacao = conteinerizacao;
    }

    public BackEnd(boolean conteinerizacao) {
        this.conteinerizacao = conteinerizacao;
    }

    public BackEnd() {
    }

}
