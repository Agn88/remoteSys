package br.ind.rosseti.remoteSys.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.ind.rosseti.remoteSys.entities.Machine;
import br.ind.rosseti.remoteSys.entities.MachineDetail;
import br.ind.rosseti.remoteSys.services.MachineDetailService;
import br.ind.rosseti.remoteSys.services.MachineService;

@RestController
@RequestMapping(value = "/machines")
public class MachineResource {

	@Autowired
	private MachineService machineService;

	@Autowired
	private MachineDetailService machineDetailService;
	/*
	 * @GetMapping public ResponseEntity<List<Machine>> findAll(){ List<Machine>
	 * list = service.findAll(); return ResponseEntity.ok().body(list); }
	 */

	/*
	 * @GetMapping(value = "/{id}") public ResponseEntity<Machine>
	 * bindById(@PathVariable Long id){ Machine obj = service.findById(id); return
	 * ResponseEntity.ok(obj); }
	 */

	@GetMapping
	public ModelAndView listar() {
		List<Machine> lista = machineService.findAll();

		ModelAndView modelAndView = new ModelAndView("machines");
		modelAndView.addObject("machines", lista);

		return modelAndView;
	}

	@GetMapping(value = "/{id}")
	public ModelAndView listagem(@PathVariable Long id) {
		
		List<MachineDetail> lista = null;
		//lista.add(machineDetailService.findById(id));
		

		ModelAndView modelAndView = new ModelAndView("details");
		modelAndView.addObject("details", lista);

		return modelAndView;
	}

	/*
	 * @RequestMapping(value = "/machines/{id}", method = RequestMethod.GET) public
	 * ModelAndView listar2(@PathVariable Long id) {
	 * 
	 * Machine obj = service.findById(id);
	 * 
	 * 
	 * List<MachineDetail> list = null; list.add(serviceDetails.findById(id));
	 * 
	 * ModelAndView modelAndView = new ModelAndView("/details");
	 * modelAndView.addObject("details", list); return modelAndView; }
	 */

	/*
	 * @RequestMapping(value = "/machine", method = RequestMethod.GET) public
	 * List<Machine> Get() { return service.findAll(); }
	 * 
	 * @RequestMapping(value = "/machine/{id}", method = RequestMethod.GET) public
	 * ResponseEntity<Machine> find(@PathVariable Long id) { Machine obj =
	 * service.findById(id); return ResponseEntity.ok().body(obj); }
	 * 
	 */
	/*
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Validated @RequestBody Machine objDto) {
		Machine obj = service.fromDTO(objDto);
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}*/
	/*
	 * @RequestMapping(value = "/{id}", method = RequestMethod.PUT) public
	 * ResponseEntity<Void> update(@Validated @RequestBody Machine
	 * objDto, @PathVariable Long id) { Machine obj = service.fromDTO(objDto);
	 * obj.setId(id); obj = service.update(obj);
	 * 
	 * return ResponseEntity.noContent().build(); }
	 */
}