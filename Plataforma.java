import java.util.LinkedList;
import java.util.List;

public class Plataforma {
	
	private List<Video> videos = new LinkedList<Video>();
	
	public void cadastrarVideo(Video video) {
		videos.add(video);
	}
	
	public List<Video> buscarVideoPorCategoria(Categoria categ){
		List<Video> videosEncontrados = new LinkedList<Video>();
		for(Video video:videos) {
			if(video.getCateg().camparar(categ)) videosEncontrados.add(video);
		}
		return videosEncontrados;
	}
	
	public Video buscarVideoPorNome(String nome) {
		for(Video video:videos) {
			if(video.getNome().equals(nome)) {
				return video;
			}
		}
		return null;
	}
	
	public List<Video> getVideos(){
		return this.videos;
	}
}
