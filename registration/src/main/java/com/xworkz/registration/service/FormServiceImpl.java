package com.xworkz.registration.service;



import com.xworkz.registration.dto.FormDB;
import com.xworkz.registration.repository.FormRepository;

public class FormServiceImpl implements FormService {
	private FormRepository formRepository;

	public FormServiceImpl(FormRepository formRepository) {
		this.formRepository = formRepository;
	}

	@Override
	public void saveForm(FormDB form) {
		formRepository.saveForm(form);
	}

	@Override
	public FormDB getFormById(int id) {
		return formRepository.getFormById(id);
	}

	@Override
	public FormDB getFormByContact(long contact) {
		return formRepository.getFormByContact(contact);
	}

	@Override
	public boolean verifyPasswordForUser(String email, String password) {
		return formRepository.verifyPasswordForUser(email, password);
	}

	@Override
	public boolean deleteFormById(int id) {
		FormDB form = formRepository.getFormById(id);
		if (form != null) {
			formRepository.deleteFormById(id);
			return true;
		}
		return false;

	}

	@Override
	public boolean updateFormByEmail(String email, FormDB updatedForm) {
		return formRepository.updateFormByEmail(email, updatedForm);
	}

}
