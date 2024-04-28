package pe.edu.upeu.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.modelo.Artefactos;

@Service
public class ArtefactosService {

    List<Artefactos> listaArtefactos = new ArrayList<>();

    public boolean agregarArtefactos(Artefactos artefactos) {
        return this.listaArtefactos.add(artefactos);
    }

    public List<Artefactos> listarArtefactos() {
        return listaArtefactos;
    }

    public Artefactos buscarArtefactos(String codigo) {
        for (Artefactos artefactos : listaArtefactos) {
            if (artefactos.getCodigo().equalsIgnoreCase(codigo)) {
                return artefactos;
            }
        }
        return null;
    }

    public Artefactos actualizarArtefactos(Artefactos artefactosActualizado) {
        for (Artefactos artefactos : listaArtefactos) {
            if (artefactos.getCodigo().equalsIgnoreCase(artefactosActualizado.getCodigo())) {
                artefactos.setNombre(artefactosActualizado.getNombre());
                artefactos.setCantidad(artefactosActualizado.getCantidad());
                return artefactos;
            }
        }
        return null;
    }

    public void eliminarProducto(String codigo) {
        listaArtefactos.removeIf(producto -> producto.getCodigo().equalsIgnoreCase(codigo));
    }
}
