package server;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.Socket;
import java.io.Serializable;
import org.json.JSONObject;

public class Usuario implements Serializable {

    private Socket socket;
    private PrintStream out;
    private BufferedReader in;
    private String nome;
    private String tipo;
    private String material;
    private String descricao;
    private String ip;
    private JSONObject json;
    private String porta;
    private boolean ocupado;
    private int falando;
    
    public int getFalando() {
        return falando;
    }

    public void setFalando(int falando) {
        this.falando = falando;
    }
    
    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }


    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public PrintStream getOut() {
        return out;
    }

    public void setOut(PrintStream out) {
        this.out = out;
    }

    public BufferedReader getIn() {
        return in;
    }

    public void setIn(BufferedReader in) {
        this.in = in;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public void setJson(JSONObject json) {
        this.json = json;
    }

    public JSONObject getJson() {
        return json;
    }

}
