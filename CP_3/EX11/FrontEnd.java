package EX11;

public class FrontEnd extends TecnologiasDesenvolvimento implements Tecnologia {

    private boolean compatibilidadeWeb;
    private boolean compatibilidadeMobile;

    public boolean isCompatibilidadeWeb() {
        return this.compatibilidadeWeb;
    }

    public boolean getCompatibilidadeWeb() {
        return this.compatibilidadeWeb;
    }

    public void setCompatibilidadeWeb(boolean compatibilidadeWeb) {
        this.compatibilidadeWeb = compatibilidadeWeb;
    }

    public boolean isCompatibilidadeMobile() {
        return this.compatibilidadeMobile;
    }

    public boolean getCompatibilidadeMobile() {
        return this.compatibilidadeMobile;
    }

    public void setCompatibilidadeMobile(boolean compatibilidadeMobile) {
        this.compatibilidadeMobile = compatibilidadeMobile;
    }

    public FrontEnd(boolean compatibilidadeWeb, boolean compatibilidadeMobile) {
        this.compatibilidadeWeb = compatibilidadeWeb;
        this.compatibilidadeMobile = compatibilidadeMobile;
    }

    public FrontEnd() {
    }

    @Override
    public String decreveLinguagem(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String descreveFramework(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

}
