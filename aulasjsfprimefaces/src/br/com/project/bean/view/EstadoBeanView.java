package br.com.project.bean.view;

import java.util.List;

import javax.faces.model.SelectItem;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.project.bean.geral.BeanManagedViewAbstract;
import br.com.project.geral.controller.EstadoController;

@Controller
@Scope(value = "session")
@ManagedBean(name = "estadoBeanView")
public class EstadoBeanView extends BeanManagedViewAbstract {

	private static final long serialVersionUID = 1L;
	
	@Resource
	private EstadoController estadoController;
	
	public List<SelectItem> getEstados() throws Exception {
		return estadoController.getListEstado();
	}

}
