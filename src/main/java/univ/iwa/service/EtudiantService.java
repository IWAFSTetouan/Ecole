package univ.iwa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import univ.iwa.model.Etudiant;
import univ.iwa.repository.EtudiantRepository;
@Service
public class EtudiantService {
	@Autowired EtudiantRepository etudiantRepository;
public List<Etudiant> getAllEtudiants() {
	return etudiantRepository.findAll();
}

public Optional<Etudiant> getEtudiantById(Long id) {
	return etudiantRepository.findById(id);
}

public Etudiant addEtudiant(Etudiant etudiant) {
	return etudiantRepository.save(etudiant);
}
public void deleteEtudiant(Long id) {
	etudiantRepository.deleteById(id);
}

public Etudiant updateEtudiant(Etudiant etudiant) {
	return etudiantRepository.save(etudiant);
}

public List<Etudiant> getEtudiantsByFiliereId(Long id) {
	return etudiantRepository.findByFiliereId(id);
}
}
