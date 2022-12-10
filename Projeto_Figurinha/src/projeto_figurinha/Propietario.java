package projeto_figurinha;
import java.util.ArrayList;

public class Propietario {
	private String nomePropietario;
	private int idadePropietario;
	private String sexoPropietario;
	private ArrayList<Album_Figurinha> albumFigurinhas;
	
	public Propietario(String nome, int idade, String sexo){
		nomePropietario = nome;
		idadePropietario = idade;
		sexoPropietario = sexo;
		this.albumFigurinhas = new ArrayList<>();
	}
	// gets e sets 
	
	public String getNomePropietario() {
		return nomePropietario;
	}
	public void setNomePropietario() {
		this.nomePropietario = nomePropietario;
	}
	public int getIdadeProipietario() {
		return idadePropietario;
	}
	public void setIdadePropietario() {
		this.idadePropietario = idadePropietario;
	}
	public String getSexoropietario() {
		return sexoPropietario;
	}	
	public void setSexoPropietario() {
		this.sexoPropietario = sexoPropietario;
	}
	public ArrayList<Album_Figurinha> getalbumFigurinhas() {
		return  albumFigurinhas;
	}

	public void setAlbum_Figurinhas(ArrayList<Album_Figurinha>  albumFigurinhas) {
		this. albumFigurinhas =  albumFigurinhas;
	}
	
	//outros metodos
	public void cadastrarAlbum_Figurinha(Album_Figurinha albumFigurinha) {
		albumFigurinha.add(albumFigurinha);


	}

