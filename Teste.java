import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		
		Plataforma plataforma= new Plataforma();
		
		assertEquals(plataforma.getVideos().size(), 0);
		
		plataforma.cadastrarVideo(new Video("DIY", new Categoria("entretenimento")));
		plataforma.cadastrarVideo(new Video("receita ", new Categoria("culinaria ")));
		
		assertEquals(plataforma.getVideos().size(), 2);
		
		Video videoEncontrado= plataforma.buscarVideoPorNome("receita ");
		
		assertEquals(videoEncontrado.getCateg().getNome(),"culinaria ");
		
		List<Video> videosEncontrados= plataforma.buscarVideoPorCategoria(new Categoria("entretenimento") );
		
		assertEquals(videosEncontrados.get(0).getCateg().getNome(),"entretenimento");
	}

}
